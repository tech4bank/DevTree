package myapp;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class randomNUMthread implements Runnable {

        private String name;
        private Integer range;
        private List<Integer> numList;


        public randomNUMthread (String name, Integer range, List<Integer> numList) {
        this.name = name;
        this.range = range;
        this.numList = numList;
        }

        @Override
        public void run() {
            // body of thread
            Random rand = new SecureRandom();
            for (Integer i=0; i<10; i+=1); {
                Integer num = rand.nextInt(range)
                numList.add(num);
                System.out.printf("%d [%s] ")
            }

        }





    }
