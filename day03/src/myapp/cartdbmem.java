package myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class cartdbmem {

    HashMap<String, ArrayList<String>> userMap = new HashMap<String, ArrayList<String>>();

    public cartdbmem() {
        this.userMap = this.loadDataFromFiles(baseFolder); 
    }

    public HashMap<String, ArrayList<String>> loadDataFromFiles(String baseFolder) 
    File f = new File(baseFolder);
    File [] filteredFiles = f.listFiles new FilenameFilter() {
        return filename.endsWith(suffix: ".db");

    }


    //read files & turn each file into an array list
    public void ReadFile(File f) {
        try {
            BufferedReader bf = new Bufferedreader(new FileReader(f));
            String line;
            while ((line = bf.readline()) !=null) {
                line = line.trim();
                datalist.add(line);

            }
            
        }
    }

     }
    
    

