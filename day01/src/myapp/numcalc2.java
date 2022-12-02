package myapp;

import java.io.Console;

public class numcalc2 {
    public static void main (String[] args) {
        Console cons = System.console();
        int total = 0;
        int count = 0;
        String input = cons.readLine("Enter a number ");

            while (true) {
                input = cons.readLine("enter number");
            if (input.equals("stop")) {
                break;
            }
            count = count + 1;
            total = total + Integer.parseInt(input);
            }

        System.out.printf("The total is %d numbers %d total" , count, total);
        }
    }