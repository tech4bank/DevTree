package myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;

// recreates the whole file

public class ShoppingCartDB {

     // valid commands
     public static final String LOGIN = "login";
     public static final String ADD = "add";
     public static final String LIST = "list";
     public static final String SAVE = "save";
     public static final String EXIT = "exit";
     public static final String USERS = "users";
     

     public static final List<String> VALID_COMMANDS = Arrays.asList(LOGIN, ADD, LIST, EXIT, USERS);


     private cartdbmem db;
     private String currentUser;
 
     public ShoppingCartDB() {
         this.db = new cartdbmem();
         this.basefolder = "db";  //default


    public ShoppingCartDB(String basefolder) {
        this.db = new cartdbmem();
        this.basefolder = basefolder;
    }
    public void setup() {
        File f = new File (this.baseFolder);
        if (f.isDirectory()) {
            // skips if directory exists
        } else {
            try {
                Files.createDirectory(p);
        } catch (IOExceotion e) {
            System.out.println("error : " + e.getmessage());

        }
    }
    

     }
 


    public void startShell() {
        System.out.println("welcome to multi user shopping cart");

        Scanner sc = new Scanner(System.in);

        sc.next();       // for commands (record input till white-space)
        sc.nextLine();  // for inputs (record input till whole line end)

        String line;
        boolean stop = false;
        
        while (!stop) {
            line = sc.nextLine();
            line = line.trim();
            System.out.println("=> " + line);
            
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("exiting !!!");
                stop = true;

            }

            //validate command
            if (!this.ValidateInput(line)) {
                System.out.println("invalid input: ^^");
            }

            }
            sc.close();

        }

        
        public boolean ValidateInput(String input) {
            String[] parts = input.split(" ");
            String command = parts[0];

            // Scanner lsc = new Scanner(input);
            // String commd = lsc.next().trim();

            return VALID_COMMANDS.contains(command);    //capital thing is from top
            
        }


        //process command (method)
        public void ProcessInput(String input) {
            Scanner sc = new Scanner(input); 
            String command = sc.next().trim();

            switch (command) {
                case LOGIN:
                String username = sc.nextLine().trim();
                this.LoginAction(username);
                System.out.println("print current user ");
                break;

                case LIST:
                this.ListAction();
                break;

                case ADD:
                String [] items = sc.nextLine().trim().split(",");
                this.AddAction(items);
                break;

                case SAVE:
                break;

                case USERS:
                break;

                default:
                break;

            }
            sc.close();


        }

        public void LoginAction(String username) {

            // user alreay exists
            if (this.db.userMap.containsKey(username)) {
                this.db.userMap.put(username, new ArrayList<String>());
            }
            this.currentUser = username;
        }

        public void AddAction(String[] items) {
            for (String item : items) {
                this.db.userMap.get(this.currentUser).add(item.trim());
                //this line above is the important repeated line

            }
        }

        public void ListAction() {
            for(String item: this.db.userMap.get(this.currentUser)) {
                System.out.println("Item ->" + item);
            }
        }

        public void SaveAction() {
            // get current username
            String userName = this.currentUser;
            //prepare the filepath = "db/<username>.db"
            String outputFilename = String.format(format: "%s / %s .db"),
            this.baseFolder, this.currentUser);

            try {
                FileWriter fw = new FileWriter (outputFilename);
                // save contents for this user in Map to a file.
                for (String item :  this.db.userMap)
            } 

            for (String item: this.db.userMap.get(this.currentUser)) {

                System.out.println("item -> " + item);

            }
        }


        }


        

