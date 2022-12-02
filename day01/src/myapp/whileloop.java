package myapp;

import java.io.Console;

public class whileloop {
    public static void main (String[] args) {
        Console cons = System.console();

        String name = "";
        while (name.trim().length() <=0) {
            name = cons.readLine("pls type name");
        }
        System.out.printf("Hi %s nice to meet", name);
        
    }
}