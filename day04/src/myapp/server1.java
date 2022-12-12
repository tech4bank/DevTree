package myapp;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
    
    public static void main(String[] args) {
        System.out.println("SOCKET SERVER: ");
        int PORT = 12345;

        //created serversocket
        try {
        ServerSocket server = new ServerSocket(PORT);

        // get socket object
        Socket socket = server.accept();
        // accepted connection from client

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        DataInputStream dis = new DataInputStream(bis);

    //    String msg = dis.readUTF(); // displays msg from client (if any)
    //    System.out.println("msg recieved -> " + msg);
    //    socket.close();

        String fromClient = dis.readUTF();
        while (!fromClient.equalsIgnoreCase("close") && fromClient !=null) {

            //process the msg
            System.out.println("received msg from client: " + fromClient);
            //read next line from input stream
            fromClient = dis.readUTF();
        }

        System.out.println("Closing socket");
        
        
        socket.close();
        server.close();

        } catch (IOException e) {
            System.out.println("IO ERROR");
        }
}
}
