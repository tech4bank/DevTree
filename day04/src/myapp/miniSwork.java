package myapp;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class miniSwork {
    
    public static void main(String[] args) {
        int PORT = 12000;

        try {
            ServerSocket server = new ServerSocket(PORT);
            Socket sc = server.accept();

            DataInputStream dis = new DataInputStream (new BufferedInputStream(sc.getInputStream()));

            String line = dis.readUTF();
            while (!line.equalsIgnoreCase("EDF") && line != null) {
                    System.out.println("got: -> " + line);
                    
                    // read next line
                    try{
                        line = dis.readUTF();
                
                } catch (IOException e) {
                    System.out.println("reached end of file");
                }
                server.close();
                sc.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
        

    
    
