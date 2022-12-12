package myapp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class startthread {
    public static void main(String[] args) {

        List<Integer> numList = new LinkedList<>();

        Executors.newFixedThreadPool(2);
        


        //to start the randomNUMthread
        // ask the ExecutorService to pass over 2 threads
        // Executor.newFixedThreadPool(2);
        // ExecutorService threadpool = Executor.newFixedThreadPool(2);
        // max no. of threads is limited by CPU hardware max threads across all cores


        //in total 4 threads made here ( 1 main thread + 3 generated threads)
        //note: prog doesn't end cos threadpool still running (need to ctrl+C)
        


        for (Integer i=0; i<3; i+=1) {
            //creates a thread
            randomNUMthread thrVar = new randomNUMthread("thrVar-%d".formatted(i), 100);
            // missing the last list para

            // manually run on this main thread (cmd on next line)
            // thrVar.run()

            //the alt thread run() is below 
            //schedule a thread to runabble on randumNUMthread
            threadpool.submit(thrVar);
        }

        System.out.println("all done");

        while (true) {
            System.out.println("numList" + numList);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }
    }
}
