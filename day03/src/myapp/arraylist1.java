package myapp;

import java.util.ArrayList;

public class arraylist1 {
    
    public static void main(String[] args) {
        System.out.println("array list demo");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("apples");
        mylist.add("oranges");

        for (String item : mylist) {
            System.out.println("Item -> " + item);
        }

        mylist.remove("apples");

        int count = mylist.size();
        System.out.println(count);

    }
}
