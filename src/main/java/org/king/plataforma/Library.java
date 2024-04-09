package org.king.plataforma;

public class Library {    
    public String greet(String name) {
        return "greet from plataforma, " + name;
    }
    public String greet1(String name) {
        org.king.libdep1.Library libDep1 = new org.king.libdep1.Library();
        return "greet1 from plataforma " + libDep1.greet(name);
    }
    public String greet2(String name) {
        org.king.libdep2.Library libDep2 = new org.king.libdep2.Library();
        return "greet2 from plataforma " + libDep2.greet(name);
    }
    public String greet3(String name) {
        org.king.libdep3.Library libDep3 = new org.king.libdep3.Library();
        return "greet3 from plataforma " + libDep3.greet(name);
    }
    public String greet4(String name) {
        org.king.libdep4.Library libDep4 = new org.king.libdep4.Library();
        return "greet4 from plataforma " + libDep4.greet(name);
    }
    public String greet5(String name) {
        org.king.libdep5.Library libDep5 = new org.king.libdep5.Library();
        return "greet5 from plataforma " + libDep5.greet(name);
    }
    public String greet6(String name) {
        return "greet6 from plataforma " + name;
    }
}