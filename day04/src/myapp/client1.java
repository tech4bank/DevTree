package myapp;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client1 {
    
    public static void main(String[] args) {
        int PORT = 12345;
        try {
            Socket cs = new Socket("127.0.0.1", PORT);

            // get the I/O streams
            OutputStream os = cs.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);



        //    dos.writeUTF("hello world from client");
        //    dos.flush();
        //    System.out.println("msg send to server");
        //    cs.close();

            Scanner inputSc = new Scanner(System.in);
            String line;
            while (( line = inputSc.nextLine()) != null) {
                if (line.equalsIgnoreCase("close")) {
                    System.out.println("exit from shell");
                    dos.writeUTF("close");
                    dos.flush();
                    break;
                }

                dos.writeUTF(line);
                dos.flush();
                System.out.println("msg sent to client: " + line);
                
            }

            cs.close();
            inputSc.close();


        } catch (UnknownHostException e) {
            System.out.println("unable to reach server/HOST");

        } catch (IOException e) {
            System.out.println("IO ERROR");

        }
}
}
