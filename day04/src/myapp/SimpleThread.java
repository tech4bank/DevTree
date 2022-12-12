package myapp;

public class SimpleThread extends Thread {

    // replaced by MySimpleThread.java

    @Override
    public void run() { 
        System.out.println("thread started exercution +" + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        
        } catch (InterruptedException e) {
            //waits abit
        }

        System.out.println("thread stopped exercution +" + Thread.currentThread().getName());

    }
}

