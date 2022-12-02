package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class todolist {
    public static void main(String[] args) {
        List<Integer> listofint = new LinkedList<> () ;

        Console cons = System.console() ;

        String item = "";

        while (true) {
            item = cons.readLine("pls enter a number");
            item = item.trim();

            if ("stop".equals(item))
            break;

            // add item to list
            listofint.add(Integer.parseInt(item));
            
        }
    System.out.printf("number of elements in the list: %d", listofint.size());
    
        int index = 0;
        int i = 0;
        while(index < listofint.size()) {
            System.out.println(listofint.get(i));
            i = i + 1;

        }

        for (index = 0; index < listofint.size(); index = index + 1)
        // 3 steps => initialise, test, increment
        System.out.printf("%d: %s", index, listofint.get(index));

    }
    
}
