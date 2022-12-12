package myapp;

// MySimpleThread need to replace with SimpleThread for ThreadSockHandle to run etc

public class threadEG {

    public static void main(String[] args) {
        System.out.println("main thread");

        // Thread t1 = new SimpleThread();
        // t1.start();
        // Thread t2 = new SimpleThread();
        // t2.start();

        Thread s1 = new MySimpleThread();
        s1.start();
        
        Thread s2 = new MySimpleThread();
        s2.start();
        
        System.out.println("finish exercution");
        System.out.println("exit");
    }
    
}
