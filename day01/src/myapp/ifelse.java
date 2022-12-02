package myapp;

import java.io.Console;

public class ifelse {
    public static void main (String[] args) {
        Console cons = System.console();
        String name = cons.readLine ("what is your name?");

        if (name.trim().equals("fred")){
            System.out.println("hi fred, i know");
            // trim removes blank spaces
        }
        else if (name.equals("barney")){
            System.out.println("hi barney, i see");
        }
        else if (name.isEmpty()){
            System.err.println("pls enter name");
        }
        else {
        System.out.printf("Hi %s nice to meet", name);
        }
    }
    
}
