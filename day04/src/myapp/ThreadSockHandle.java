package myapp;

    import java.io.BufferedInputStream;
    import java.io.BufferedOutputStream;
    import java.io.DataInputStream;
    import java.io.DataOutputStream;
    import java.io.IOException;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.net.UnknownHostException;
    import java.util.Scanner;

public class ThreadSockHandle {
   
        // a combi of client & server in one (why?) [Note = high lvl API version]
    
        public static void main(String[] args) {
    
            
            // huge string paragraph style
            String usage = """
                // usage: Server
                // <program> <server> <port> <cookie-file.txt>
                
                // Usage: Client
                // <program> <client> <host> <port>                
                    """;
                            
    
            // needs 3 arguments to even run 
            if ((args.length) == 0) {
                System.out.println("incorrect inputs. pls check the following usage");
                System.out.println(usage);
            }
    
            String type = args[0];
            if (type.equalsIgnoreCase("server")) {
                int port = Integer.parseInt(args[1]);
                String filename = args[2];
                StartServer(port, filename);
            } else if (type.equalsIgnoreCase("client")) {
                String hostname = args[1];
                int port = Integer.parseInt(args[2]);
                StartClient(hostname, port);
            } else {
                System.out.println("incorrent arguments");
            }
    
        }
    
        //server portion
        public static void StartServer(int port, String filename) {
            ServerSocket srver;
            try {
                srver = new ServerSocket(port);
                Socket socket = srver.accept();
    
                //in stuff
                DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
                //out stuff
                 DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    

                 @Override
                 public void run() {
                     // Handle the socket communication here.


                 while (true) { 
                    String fromClient = dis.readUTF();
    
                    if (fromClient.equalsIgnoreCase("exit")) {
                        // sends random cookie from file
                        break;
                    } 
    
                    if (fromClient.equalsIgnoreCase("get-cookie")) {
                        // sends random cookie from file
                        dos.writeUTF("dummy cookie not used");
                        dos.flush();
    
                    } else {
                        // sends msg, "invalid command from server"
                        dos.writeUTF("from server: invalid command");
                        dos.flush();          
                    }
                 }
    
                 socket.close();
    
    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        // client portion
        public static void StartClient(String host, int port) {
            try { 
                Socket socket = new Socket(host, port);
    
                //in stuff
                DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
                //out stuff
                DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    
                Scanner sc = new Scanner(System.in);
                boolean stop = false ;
    
                while (!stop) {
                    String line = sc.nextLine();
                    if (line.equalsIgnoreCase("exit")) {
                        stop = true;
                        break;
                    }
    
                    if (line.equalsIgnoreCase("get-cookie")) {
                        // send get-cookie request
                        dos.writeUTF("get-cookie");
                        dos.flush();
                    
                    } else {
                        System.out.println("invalid command: " + line);
                        
                    }
    
                    String fromServer = dis.readUTF();
                    System.out.println("server response" + fromServer);
    
                }
    
                socket.close();
                sc.close();
    
    
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }   
        
        
        }
    
        
    }
    
    
}
