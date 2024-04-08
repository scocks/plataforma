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
                    sh """                    
                    microdnf install git
                    pwd
                    ls
                    ./gradlew incrementVersion --versionIncrementType=PATCH --versionIncrementBranch=main -PgitUserName=ci-user -PgitUserEmail=ci-user@king.com                    
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
