package myapp;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.Future;

public class lambdathreads {

    //unfinished for sure

    public static void main(String[] args) {
        ExecutorService thrpool = Executors.newFixedThreadPool(2);

        Runnable run = () -> {
            Random rnd = new SecureRandom();
                    for (Integer j = 0; j < 10; j+=1)
                    System.out.printf("[%d]: %d", j, rnd.nextInt(100));
        };


        // example of 'free' & 'bound' variables
        for(Integer i=0; i<3; i+=1) {
            thrpool.submit(
                // runable - public void run() part
                () -> {
                    Random rnd = new SecureRandom();
                    for (Integer j = 0; j < 10; j+=1)
                    System.out.printf("[%d]: %d", j, rnd.nextInt(100))
                    
                }
            )

                }
                
            
        }
    }
