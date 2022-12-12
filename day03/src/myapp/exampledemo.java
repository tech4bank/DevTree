package myapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class exampledemo {
    
    public static void main(String[] args) {
        String filePath1 = "C:/Users/bios4uart/source/day03/src/demo.txt";
        String filePath2 = "C:/Users/bios4uart/source/day03/src/demo2.txt";
        ReadFile(filePath1);
        WriteFile(filePath2);


    }

    public static void ReadFile(String fname) {

        //path object
        Path pth = Paths.get(fname);
        File fobj = pth.toFile();

        if (fobj.exists()) {
            System.out.println("file exists");

        } else { 
            System.out.println("file not found");

        }

        //reader object etc (read file)


        try {
        FileReader fr = new FileReader(fobj);
        BufferedReader bdf = new BufferedReader(fr);

        String line = bdf.readLine();
        System.out.println("first line => " + line);

        // next 2 code lines replace with mini loop
        //line = bdf.readLine();
        //System.out.println("second line => " + line);

        while (null != (line = bdf.readLine())) {
            System.out.println(">" + line);

        }
        
        bdf.close();
        }
    
        catch (FileNotFoundException e) {
            System.out.println("file not found. pls check input file: " + e.getMessage());
        }
        
        catch (IOException e) { 
            System.out.println("unable to read line: " + e.getMessage());

        }


        // writer object (write file) (non-buffered) [unsure of accuracy]
      //  public static void WriteFile(String fname) {
        //   try {
           //     FileWriter fw = new FileWriter(fname, false); 
             //   fw.write("apple \n");
               // fw.write("orange \n");
          //      fw.write("pear \n");
//
  //              fw.flush();
    //            fw.close();
      //          
        ///    } catch (IOException e) {
           //     System.out.println("unable to write line: " + e.getMessage());
//
  //          }
        // }

        // writer object (write file) (buffered)
       


    }

    public static void WriteFile(String fname) {
        try {
            FileWriter fw = new FileWriter(fname, false);
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("apple \n");
            bfw.write("orange \n");
            bfw.write("pear \n");

            bfw.flush();
            bfw.close();
            
        } catch (IOException e) {
            System.out.println("unable to write line: " + e.getMessage());

        }
    }

    
}
