/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hailin Xie  Student ID2035808
 */
package CW3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hailin Xie  Student ID2035808
 */

public class FileUtils {
       
    public static List<Person> readFile(String filename){

        Path path = Paths.get(filename);
        List<Person> people = new ArrayList<>();
        try {
            BufferedReader reader= Files.newBufferedReader(path);
            String content = reader.readLine();
            while (content != null){
                Person person = new Person(content);
                people.add(person);
                System.out.println(content);
                content = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        // Receive a filename String, and read a file, storing all person 
        // information in an arraylist, handling any file reading errors and
        // returning an array list
        
        // Complete this method
        
        // temporary return line, change this
        return people;
    }
}
