package myapp;

import java.util.List;

public class lambda {


    //example partB
    public static void apply(singleMgreet greeting, String value ) {
        singleMgreet.hello(value);
        
    }

    // signiture looks like method inside singleMgreet






    public static void main(String[] args) {
        
        //called a lamba (anonomous methods)
        singleMgreet hi = (nameA) -> {
            System.out.printf("hello %s", nameA);
        };

        hi.hello("fred");
            // hi = interface, hello = method


            List<String> names = List.of("fred", "barney", "wilma", "betty");
            Systen.out.printf("say hello to %s", names);

            for =(String n: names)
            apply (hi, n);



            // example part 3
            toUpperCase("hello world");
            
            
            //UNFINISH HERE ETC



        }
    }
    
}
