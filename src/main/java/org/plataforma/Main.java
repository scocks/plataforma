package org.plataforma;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] result = library.count(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
        System.out.println("plataforma");
        System.out.println(library.greet("plataforma"));
        System.out.println(library.greet1("plataforma"));
        System.out.println(library.greet2("plataforma"));
        System.out.println(library.greet3("plataforma"));
        System.out.println(library.greet4("plataforma"));
        System.out.println(library.greet5("plataforma"));
        System.out.println(library.greetAll("plataforma"));
    }
}