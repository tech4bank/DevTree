package myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap1 {

    public static void main(String[] args) {

        // combiVar = usermap (on bala sample eg)
        HashMap<String, ArrayList<String>> combiVar = new HashMap<String, ArrayList<String>>();

        combiVar.put("bala", new ArrayList<String>());
        combiVar.put("fred", new ArrayList<String>());
        combiVar.put("ken", new ArrayList<String>());



        
        //   key/value
        //   String, Integer
        HashMap<String, Integer> mapVar = new HashMap<String, Integer>();

        // add one key-value pair
        mapVar.put("bala", 30);
        mapVar.put("ken", 40);


        String key = "bala";
        System.out.println("Value for key = " + key + "->" + mapVar.get(key));


        mapVar.put("bala", 31);
        System.out.println("new value for key = " + key + "->" + mapVar.get(key));

        //check if key exists
        System.out.println("check if fred exists: " + mapVar.containsKey("fred"));
        
    }





    
    
}
