package myapp;

import java.io.Console;

public class numcalc {
    public static void main (String[] args) {
        Console cons = System.console();
        int total = 0;
        String input = cons.readLine("Enter a number ");
        while (!input.trim().toLowerCase().equals("stop")) {
            int num = Integer.parseInt(input);
        switch (num) {
            case (1):
            total = total + 1;
            break;
        
            case (2):
            total = total + 2;
            break;
     
            case (3):
            total = total + 3;
            break;
        
            case (4):
            total = total + 4;
            break;
         
            case (5):
            total = total + 5;
            break;
        
            case (6):
            total = total + 6;
            break;
        
            case (7):
            total = total + 7;
            break;
        
            case (8):
            total = total + 8;
            break;
        
            case (9):
            total = total + 9;
            break;

            case (10):
            total = total + 10;
            break;

            case (0):
            break;
        }
        input = cons.readLine("Enter a number ");
    }
    System.out.printf("The total is %d", total);
        }        
    }
