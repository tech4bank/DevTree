package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class workshop1 {
 
    public static void main(String[]args) {
        List<String> cart = new LinkedList<>() ;
        Console cons = System.console();
        Boolean stop = false;
        while (!stop) {
            String line = cons.readLine("> ");
            line = line.trim()
            String[] terms = line.split(" ");
        }

    switch (terms[0]) {
        case "list":
        if (cart.size() <= 0) {
            System.out.println("your cart is empty");
            } else {
            System.out.println("the contents of your cart");
            for (Integer idx = 0; idx < cart.size(); idx = idx + 1)
            System.out.printf("%d. %s", idx + 1, cart.get(idx));
            }
        break;

        case "add":
        cart.add(terms[1]);
        System.out.printf("added %s to cart", terms);
        break;

        case "delete":
        break;

        default:
        System.err.printf("unknown command: %s", terms[0]);

        // code missing relook
    }
}
}