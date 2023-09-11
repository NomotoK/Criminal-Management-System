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

import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Hailin Xie  Student ID2035808
 */
public class Menu {

    // ArrayList for id
    List<Person> ids = new ArrayList<>();
    
    public void mainMenu(String fileName) {
        
        // Display a welcome message, get option and input
        
        // Do not Change
        
        System.out.println("\nCriminal Database Menu \n");
        System.out.println("Choose an option: ");
        System.out.println("1. Load Crime File");
        System.out.println("2. List all Criminals");
        System.out.println("3. Search for a Criminal");
        System.out.println("4. Generate a Wanted Poster");
        System.out.println("5. Generate Stats");
        System.out.println("6. Check Criminal for ID Fraud");
        System.out.println("7. Exit");

        // Get input from method
        int command = getIntInput();
        System.out.println("You entered " + command);
        switch (command) {
            case 1:
                System.out.println("Load Database");
                ids = loadFiles(fileName, ids);
                break;
            case 2:
                System.out.println("Listing all Criminals");
                listPeople(ids);
                break;
            case 3:
                System.out.println("Search for a Criminal with partial match");
                String input = getStringInput("Please input a partial match for the ID file");      
                searchIDs(ids, input);
                break;
            case 4:
                System.out.println("Generate a Wanted Poster");
                input = getStringInput("Please input a exact match for the ID code"); 
                
                generatePoster(ids, input);
                break;
            case 5:
                System.out.println("\nGenerate Stats");
                generateStats(ids);
                break;
            case 6:
                System.out.println("Check for Fraud");
                input = getStringInput("Please input a exact match for the ID code");                
                // Get a boolean of whether valid
                boolean valid = checkFraud(ids, input);
                if(valid){
                    System.out.println("Valid ID");
                } else {
                    System.out.println("Invalid ID or not found in system");
                }
                
                break;
            case 7:

                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice, please re-enter between 1 and 6");
            //  showMenu();
        }
        // Loop through menus again
        mainMenu(fileName);
    }
    
    
    private List<Person> loadFiles(String fileName, List<Person> ids) {
        // Method to handle loading of file and writing into array
        // Completed method, do not change

        System.out.println("Loading file " + fileName);
        ids = FileUtils.readFile(fileName);
        return ids;
    }
    
    // Generate Stats
    // This method is pre-completed
    private void generateStats(List<Person> ids) {
        // Method to generate stats
        // Completed method, do not change
        
        System.out.println("Number of criminals in System: " + statsIdNumber(ids));
        System.out.println("Number of Nationalities in System: " + statsNatNumber(ids));
        System.out.println("Average age of people: " + statsAvgAge(ids));
        System.out.println("Average reward level: " + avgReward(ids));
    }
    

    
    public static int getIntInput() {
        // Method to check for input
        // Completed method, do not change
        
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();

        int cmd = 6;
        try {
            cmd = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // If not a number
            System.out.println("Invalid number option chosen");
            cmd = getIntInput();
        }

        return cmd;
    }
    
    public static String getStringInput(String inputMessage) {
        // Method to receive a message to display, and get a string input
        // from keyboard
        // Completed method, do not change
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println(inputMessage);
        String input = kb.nextLine();
        return input;
    }
   
    

    
    private void listPeople(List<Person> ids) {
        // Display list of Peoople using toString method
        
        // Complete this method
        for (int i = 0; i < ids.size(); i ++){
            System.out.println(ids.get(i));
        }
       
    }

    
    private void searchIDs(List<Person> ids, String input) {
        // Method to search for people and display using toString
        // Search by full or partial match of first name, family name, nationality,
        // id or nickname, not case sensitive
        
        // Complete this method
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < ids.size(); i++){
            if (ids.get(i).toString().toLowerCase().contains(input)){
                count++;
                //System.out.println("A match attribute in the database is: " + "\n" + ids.get(i));
                System.out.println(ids.get(i));
            }
        }
       // System.out.println("Total matched number is: " + count);
    }

    private void generatePoster(List<Person> ids, String input) {
        // Method will receive a String input and a list of persons.  Will
        // Look for an exact match with the id and if a match is found, will
        // Display a wanted poster
        // Complete this method
        for (int i = 0; i < ids.size(); i ++){

            if (ids.get(i).getIdCode().trim().equals(input.trim())){

                JFrame frame = new JFrame();
                frame.setSize(400,600);
                ImagePanel panel = new ImagePanel( ids.get(i), 0, 0, 400, 600);
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Wanted Poster for Criminal: " + ids.get(i).getFirstName() + ids.get(i).getFamilyName());
                frame.setResizable(false);
                frame.add(panel);
                frame.setVisible(true);
            }
//            else {
//                System.out.println(" ID is not found in system");
//                break;
//            }

        }

    }
    
    private int statsIdNumber(List<Person> ids){
        // method to calculate the number of ids in the system
        // complete this method
        // Return temporary value, change this
        return ids.size();
    }
    
    private int statsNatNumber(List<Person> ids){
        // Method to return the number of nationalities present in the system

        // Complete this method
        ArrayList<String> Nations = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++){
            if(Nations.contains(ids.get(i).getNationality())){

            }else {
                Nations.add(ids.get(i).getNationality());
            }
        }
       // Return temporary value, change this
        return Nations.size();
    }
    
    private double statsAvgAge(List<Person> criminals){
        // Calculate age of every person in the system and return as double
        // Complete this method
        double totalAge = 0;
        double averageAge = 0;
        for (int i = 0; i < criminals.size(); i ++){
            totalAge += criminals.get(i).getAgeinYears();
        }
        averageAge = totalAge/criminals.size();
        // Return temporary value, change this
        return averageAge;
    }
    
    private double avgReward(List<Person> ids){
        // Method to calculate average reward amount of all people in system
        // Complete this method
        double totalReward = 0;
        double averageReward = 0;
        for (int i = 0; i < ids.size(); i ++){
            totalReward += ids.get(i).getReward();
        }
        averageReward = totalReward/ids.size();
        // Return temporary value, change this
        return averageReward;
    }
    
    private boolean checkFraud(List<Person> ids, String input){
        // Method to check if an ID is valid or invalid.  Receives an ID string 
        // and a list of people.  Valid ID if:

        // when the user inputs an ID code, a matching ID is found in the system
        // The ID code is 8 characters in length
        // The code begins with an “A”, “B”, or “C” (case sensitive)
        // The third character matches the last number of their year of birth
        // The final 2 characters are a checksum, and should add up to 7
        // Complete this method
        // Return temporary value, change this

        for (int i = 0; i < ids.size(); i ++){
            if (ids.get(i).getIdCode().trim().equals(input.trim())){
                if(input.length() == 8){
                    if (input.startsWith("A")|| input.startsWith("B")|| input.startsWith("C")){
                        String DobChar = "";
                        for (int j = 0; j < ids.size(); j ++) {
                            DobChar += String.valueOf (String.valueOf(ids.get(i).getDob().getYear() + 1900).charAt(3));
                        }
                        if (DobChar.contains(String.valueOf(input.charAt(2)))){
                            if(Integer.parseInt(String.valueOf(input.charAt(6))) + Integer.parseInt(String.valueOf(input.charAt(7))) == 7){
                                return true;
                            }
                        }
                    }
                }
            }
        }

        // Return temporary value, change this
        return false;
    }

}
