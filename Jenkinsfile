pipeline {
   agent {
        kubernetes {
            cloud 'kubernetes'
            label 'mypod'
            yaml """
                apiVersion: v1
                kind: Pod
                spec:
                  containers:
                    - name: jdk17
                      image: openjdk:17-jdk
                      command: ['cat']
                      tty: true
            """
        }
    }
    stages {        
        stage('Generate Properties') {
            steps {
                container('jdk17') {                    
                    withCredentials([usernamePassword(credentialsId: 'nexus-admin-cred', passwordVariable: 'repoPassword', usernameVariable: 'repoUser')]) {
                       sh """
                       echo "repoUser=${repoUser}" > gradle.properties
                       echo "repoPassword=${repoPassword}" >> gradle.properties
                       """
                    }
                }
            }
        }
        stage('Build and Test') {
            steps {
                container('jdk17') {                                        
                    sh """
                    ./gradlew clean build test
                    """                    
                }
            }
        }
        stage('Sonar') {
            steps {
                container('jdk17') {                    
                    sh """                    
                    ./gradlew sonar
                    """
                }
            }
        }
        stage('Release') {
            when {
                expression { "${env.BRANCH_NAME}" == "main" }
                not { changeset "build.gradle" }
            }
            steps {
                container('jdk17') {                    
                    sh '''                    
                    microdnf install git        
                    git config --global --add safe.directory '*'
                    git config --global user.name "svc-jenkinsci"
                    git config --global user.email "svc-jenkinsci@king.com"
                    ./gradlew incrementVersion --versionIncrementType=PATCH 
                    '''
                    def version_value = sh(returnStdout: true, script: "cat build.gradle | grep -o 'version = [^,]*'").trim()
                    sh "echo Project in version value: $version_value"
                    def version = version_value.split(/=/)[1]
                    sh "echo final version: $version"
                    sh """
                    git add .
                    git commit -m "Release of version ${$version}"
                    git push
                    """
                }
            }
        } 
        stage('Publish') {
            steps {
                container('jdk17') {                    
                    sh """
                    ./gradlew publish
                    """
                }
            }
        }
    }
}
