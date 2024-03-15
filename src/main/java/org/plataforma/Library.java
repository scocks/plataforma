package org.plataforma;

import org.libDep1.*;
import org.libDep2.*;

public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "i = " + i;
        }
        return lines;
    }
    public String greetAll(String name) {
        org.libDep1.Library libDep1 = new org.libDep1.Library();
        org.libDep2.Library libDep2 = new org.libDep2.Library();
        org.libDep3.Library libDep3 = new org.libDep3.Library();
        org.libDep4.Library libDep4 = new org.libDep4.Library();
        org.libDep5.Library libDep5 = new org.libDep5.Library();
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
        org.libDep1.Library libDep1 = new org.libDep1.Library();
        return libDep1.greet(name);
    }
    public String greet2(String name) {
        org.libDep2.Library libDep2 = new org.libDep2.Library();
        return libDep2.greet(name);
    }
    public String greet3(String name) {
        org.libDep3.Library libDep3 = new org.libDep3.Library();
        return libDep3.greet(name);
    }
    public String greet4(String name) {
        org.libDep4.Library libDep4 = new org.libDep4.Library();
        return libDep4.greet(name);
    }
    public String greet5(String name) {
        org.libDep5.Library libDep5 = new org.libDep5.Library();
        return libDep5.greet(name);
    }
}