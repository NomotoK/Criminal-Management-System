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

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javax.imageio.ImageIO;

/**
 *
 * @author Hailin Xie  Student ID2035808
 */
public class Person {

    // Instance variables
    private String firstName;
    private String familyName;
    private String nickname;
    private int reward;
    private String nationality;
    private String idCode;
    private String crimes;
    private LocalDate dob;
    private Image photo;

    public Person(String[] info) {
        // Constructor to take a String array and assign it to instance variables
        // Complete this method
        firstName = info[0];
        familyName = info[1];
        nickname = info[2];
        reward = Integer.parseInt(info[3]);
        nationality = info[4];
        idCode = info[5];
        crimes = info[6];
        dob = convertDateOfBirth(info[7]);
        photo = readImage(info[8]);


    }

    public Person(String line) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        // Constructor to take a single string, the entire line of a file, and assign
        // it to instance variables
        // Complete this method
        String[] PersonInfo = line.split(",");
        for (int i = 0; i < PersonInfo.length; i ++){
            PersonInfo[i] = PersonInfo[i].trim();
        }

        firstName = PersonInfo[0];
        familyName = PersonInfo[1];
        nickname = PersonInfo[2];
        reward = Integer.parseInt(PersonInfo[3]);
        nationality = PersonInfo[4];
        idCode = PersonInfo[5];
        crimes = PersonInfo[6];
        dob = convertDateOfBirth(PersonInfo[7]);
        photo = readImage(PersonInfo[8]);


    }

    public BufferedImage readImage(String filename) {
        // Read an image from a file and return a Buffered image
        // Complete this method
        // Return temporary value, change this
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File(filename));
            }
            catch (IOException e){
                System.out.println("read image error!");
            }
        return image;
    }

    public LocalDate convertDateOfBirth(String inputDate) {
        // Take a date input String and convert to a local date
        // If the date is an incorrect value, assign a default value of 1/1/1991
        // Complete this method
        // Return temporary value, change this
        LocalDate DateOfBirth = LocalDate.of(1991,1,1);
        try {
            String[] dates = inputDate.split("/");
           DateOfBirth = LocalDate.of(Integer.parseInt(dates[2]),Integer.parseInt(dates[1]),Integer.parseInt(dates[0]));
        }
        catch (DateTimeException e){
            System.out.println("incorrect input DateTime, default value 1/1/1991 has been assigned");
        }
        return DateOfBirth;
    }

    public int getAgeinYears() {
        // return the age of the person in years
        // Complete this method
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public String toString() {
        // Output method as String

        // Do not change!
        String out = "***\n" + getIdCode() + ", " + getFirstName() + " "
                + getFamilyName() + ", Reward: " + getReward() + ", " + getNationality()
                + ", " + getDob().toString() + ", " + getNickname() + ", " + getCrimes();

        return out;
    }

    // All getters are completed, do not change
    public String getFirstName() {

        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getReward() {
        return reward;
    }

    public String getNationality() {
        return nationality;
    }

    public String getIdCode() {
        return idCode;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Image getPhoto() {
        return photo;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCrimes() {
        return crimes;
    }

}
