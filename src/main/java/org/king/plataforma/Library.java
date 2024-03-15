package org.king.plataforma;

public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "i = " + i;
        }
        return lines;
    }
    public String greetAll(String name) {
        org.king.libDep1.Library libDep1 = new org.king.libDep1.Library();
        org.king.libDep2.Library libDep2 = new org.king.libDep2.Library();
        org.king.libDep3.Library libDep3 = new org.king.libDep3.Library();
        org.king.libDep4.Library libDep4 = new org.king.libDep4.Library();
        org.king.libDep5.Library libDep5 = new org.king.libDep5.Library();
        StringBuilder sb = new StringBuilder(); 
        sb.append(libDep1.greet("plataforma")+",");
        sb.append(libDep2.greet("plataforma")+",");
        sb.append(libDep3.greet("plataforma")+",");
        sb.append(libDep4.greet("plataforma")+",");
        sb.append(libDep5.greet("plataforma"));
        return "Hello from plataforma, " + name + "!," + sb.toString();
    }
    public String greet(String name) {
        return "Hello from plataforma, " + name + "!";
    }

    public String greet1(String name) {
        org.king.libDep1.Library libDep1 = new org.king.libDep1.Library();
        return libDep1.greet(name);
    }
    public String greet2(String name) {
        org.king.libDep2.Library libDep2 = new org.king.libDep2.Library();
        return libDep2.greet(name);
    }
    public String greet3(String name) {
        org.king.libDep3.Library libDep3 = new org.king.libDep3.Library();
        return libDep3.greet(name);
    }
    public String greet4(String name) {
        org.king.libDep4.Library libDep4 = new org.king.libDep4.Library();
        return libDep4.greet(name);
    }
    public String greet5(String name) {
        org.king.libDep5.Library libDep5 = new org.king.libDep5.Library();
        return libDep5.greet(name);
    }
}