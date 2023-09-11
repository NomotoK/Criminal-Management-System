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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Hailin Xie  Student ID2035808
 */
public class ImagePanel extends JPanel {

    private final Image myImage;
    private final int myX, myY;
    private final int myWidth, myHeight;
    private final Person id;

    public ImagePanel(Person dispID, int myX, int myY, int myWidth, int myHeight) {
        // Constructor for image panel
        // Complete this method

        super();
        this.id = dispID;
        this.myX = myX;
        this.myY = myY;
        this.myHeight = myHeight;
        this.myWidth = myWidth;
        this.myImage = dispID.getPhoto();// initialize constructors
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        // Draw the wanted poster
        // Complete this method

        super.paintComponent(g);
        /////////////////////////////////////////////////Background Color//////////////////////////////////////////////
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        /////////////////////////////////////////////////Background Color//////////////////////////////////////////////

        Color black = new Color(229, 227, 227);
        Color silver = new Color(33, 33, 33);
        GradientPaint paint0 = new GradientPaint(0,0,silver,200,200,black,true);
        g2.setPaint(paint0);
        g2.fillRect(0,0,400,600);

        ///////////////////////////////////////////Draw gradient background////////////////////////////////////////////
        int height = 600; // height of the window
        int width = 400; // width of the window
//        BufferedImage image = null; // draw colors in this BufferedImage object
//
//        this.setPreferredSize(new Dimension(width, height)); // set preferred size of the window
//
//        image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
//        Graphics graphics = image.getGraphics();
//
//        int w = width/2; // Draw gradient colors in 2 parts
//        for (int i = 0; i < w; i++) {
//            int x = 0;
//            int rgbVal = (int) (i * (255.0 / w)); // let rgbVal increase smoothly from 0 to 255
//            // draw left part of the background
//            graphics.setColor(new Color(rgbVal, rgbVal, rgbVal)); // set colors
//            graphics.drawLine(i + w * x, 0, i + w * x++, height);
//            //draw right part of the background
//            graphics.setColor(new Color(255 - rgbVal, 255 - rgbVal, 255 - rgbVal));
//            graphics.drawLine(i + w * x, 0, i + w * x++, height);
//
//        }
//        g.drawImage(image, 0, 0, null); // show the image(the background)
        ///////////////////////////////////////////Draw gradient background////////////////////////////////////////////

        //////////////////////////////////////////Draw red decorative lines////////////////////////////////////////////

        g.setColor(Color.darkGray);
        g.fillRect(46, 32, 120, 7);
        g.fillRect(47, 33, 120, 7);
        g.fillRect(48, 34, 120, 7);
        g.fillRect(49, 35, 120, 7);
        g.setColor(Color.YELLOW);
        g.fillRect(44, 29, 120, 7);
        g.fillRect(44, 31, 120, 7);
        g.setColor(Color.RED);
        g.fillRect(45, 30, 120, 7);


        g.setColor(Color.darkGray);
        g.fillRect(219, 32, 120, 7);
        g.fillRect(218, 33, 120, 7);
        g.fillRect(217, 34, 120, 7);
        g.fillRect(216, 35, 120, 7);
        g.setColor(Color.YELLOW);
        g.fillRect(221, 29, 120, 7);
        g.fillRect(221, 31, 120, 7);
        g.setColor(Color.RED);
        g.fillRect(220, 30, 120, 7);


        g.setColor(Color.darkGray);
        g.fillRect(45, 108, 300, 7);
        g.setColor(Color.YELLOW);
        g.fillRect(44, 104, 300, 7);
        g.setColor(Color.RED);
        g.fillRect(45, 105, 300, 7);

        g.setColor(Color.darkGray);
        g.fillRect(45, 383, 300, 5);
        g.setColor(Color.YELLOW);
        g.fillRect(44, 379, 300, 5);
        g.setColor(Color.RED);
        g.fillRect(45, 380, 300, 5);

        g.setColor(Color.darkGray);
        g.fillRect(45, 432, 300, 5);
        g.setColor(Color.YELLOW);
        g.fillRect(44, 429, 300, 5);
        g.setColor(Color.RED);
        g.fillRect(45, 430, 300, 5);

        g.setColor(Color.darkGray);
        g.fillRect(45, 472, 300, 5);
        g.setColor(Color.YELLOW);
        g.fillRect(44, 469, 300, 5);
        g.setColor(Color.RED);
        g.fillRect(45, 470, 300, 5);
        //////////////////////////////////////////Draw red decorative lines////////////////////////////////////////////

        /////////////////////////////////////////////////Texts/////////////////////////////////////////////////////////

        Font myFont1 = new Font("Serif", Font.BOLD, 60);// Wanted poster title
        g.setFont(myFont1);
        String content0 = "WANTED";
        FontMetrics metrics0 = g.getFontMetrics(myFont1);
        int location0 = (width - metrics0.stringWidth(content0)) / 2;
        g.setColor(Color.darkGray);
        g.drawString(content0,location0+1,96);
        g.drawString(content0,location0+2,97);
        g.drawString(content0,location0+3,98);
        g.drawString(content0,location0+4,99);

        Color gold = new Color(225, 155, 1);
        Color white = new Color(255, 229, 194);
        GradientPaint paint1 = new GradientPaint(60,95,gold,80,120,white,true);

        g2.setPaint(paint1);
        g2.drawString("WANTED",location0,95);


        Font myFont0 = new Font("Serif", Font.BOLD, 65);// Wanted poster title
        g.setFont(myFont0);
        g.setColor(Color.darkGray);
        g.drawString("\u2605",165,51);
        g.drawString("\u2605",165,52);
        g.drawString("\u2605",165,53);
        g.setColor(Color.YELLOW);
        g.drawString("\u2605",164,48);
        g.drawString("\u2605",166,48);
        g.setColor(Color.RED);
        g.drawString("\u2605",165,50);



        Font myFont2 = new Font("Dialog", Font.BOLD, 17);// the crime of criminal
        g.setFont(myFont2);
        g.setColor(Color.darkGray);
        String content1 = "For " + id.getCrimes();
        FontMetrics metrics1 = g.getFontMetrics(myFont2);
        int location1 = (width - metrics1.stringWidth(content1)) / 2;// this part allows the string always stays in the middle
        g.drawString(content1,location1,136);
        g.drawString(content1,location1,137);
        g.setColor(Color.RED);
        g.drawString(content1,location1,135);

        Font myFont3 = new Font("Serif", Font.BOLD, 20);// the name and nickname of the criminal
        g.setFont(myFont3);
        g.setColor(Color.darkGray);
        String content2 = "\u2605" + id.getFirstName() + " \"" + id.getNickname() + "\" " + id.getFamilyName() + "\u2605";
        FontMetrics metrics2 = g.getFontMetrics(myFont3);
        int location2 = (width - metrics2.stringWidth(content2)) / 2;
        g.drawString(content2,location2,371);
        g.drawString(content2,location2,372);
        g.setColor(Color.RED);
        g.drawString(content2,location2,370);

        Font myFont4 = new Font("Serif", Font.BOLD, 40);//the reward of the criminal
        g.setFont(myFont4);
        g.setColor(Color.darkGray);
        String content3 = "REWARD: \u0024" + id.getReward();
        FontMetrics metrics3 = g.getFontMetrics(myFont4);
        int location3 = (width - metrics3.stringWidth(content3)) / 2;

        g.drawString(content3,location3 + 1,421);
        g.drawString(content3,location3 + 2 ,422);
        g.drawString(content3,location3 + 3,423);
        //g.setColor(Color.BLACK);
        g2.setPaint(paint1);
        g2.drawString(content3,location3,420);

        Font myFont5 = new Font("Serif", Font.BOLD, 30);//the nationality of the criminal
        g.setFont(myFont5);
        g.setColor(Color.GRAY);
        String content4 = "Nationality: " + id.getNationality();
        FontMetrics metrics4 = g.getFontMetrics(myFont5);
        int location4 = (width - metrics4.stringWidth(content4)) / 2;
        g.drawString(content4,location4+1,461);
        g.drawString(content4,location4+2,462);
        g.drawString(content4,location4+3,463);
        g.setColor(Color.BLACK);
        g.drawString(content4,location4,460);

        Font myFont6 = new Font("Serif", Font.BOLD, 20);//the age of the criminal
        g.setFont(myFont6);
        g.setColor(Color.darkGray);
        String content5 = id.getAgeinYears() + " years old  " + "ID Code: " + id.getIdCode();
        FontMetrics metrics5 = g.getFontMetrics(myFont6);
        int location5 = (width - metrics5.stringWidth(content5)) / 2;
        g2.drawString(content5,location5 + 1,496);
        g2.drawString(content5,location5 + 2,497);
        g2.setPaint(paint1);
        g2.drawString(content5,location5,495);

//        Font myFont7 = new Font("Serif", Font.BOLD, 20);// the id code of the criminal
//        g.setFont(myFont7);
//        g.setColor(Color.darkGray);
//        g2.drawString("ID Code: " + id.getIdCode(),176,496);
//        g2.drawString("ID Code: " + id.getIdCode(),177,497);
//        g2.setPaint(paint1);
//        g2.drawString("ID Code: " + id.getIdCode(),175,495);

        Font myFont8 = new Font("Serif", Font.BOLD, 30);//the end title of the wanted poster
        g.setFont(myFont8);

        //g.setColor(Color.YELLOW);
        g.setColor(Color.GRAY);
        g.drawString( "\u2605 DEAD OR ALIVE \u2605",41,531);
        g.drawString( "\u2605 DEAD OR ALIVE \u2605",42,532);
        g.drawString( "\u2605 DEAD OR ALIVE \u2605",43,533);
        g.drawString( "\u2605 DEAD OR ALIVE \u2605",44,534);
        g.setColor(Color.BLACK);
        g.drawString( "\u2605 DEAD OR ALIVE \u2605",40,530);
        /////////////////////////////////////////////////Texts/////////////////////////////////////////////////////////



        ////////////////////////////////////////Display photo of the criminal//////////////////////////////////////////
        g.drawImage(myImage,92,150,200,200,this);
        ////////////////////////////////////////Display photo of the criminal//////////////////////////////////////////



        ///////////////////////////////////////////////Draw Pentagram//////////////////////////////////////////////////

//        //The five pointed star is composed of three identical isosceles triangles.
//        int r = 20; // Radius of circumscribed circle of outer vertex
//        int[] x = new int[5]; // 5 x outer vertex coordinates
//        int[] y = new int[5]; // 5 y outer vertex coordinates
//        int[] x_ = new int[5]; // 5 x inner vertex coordinates
//        int[] y_ = new int[5]; // 5 y inner vertex coordinates
//
//        int c = 360 / 5; // angle
//
//        int xLocation = 173;//the location of the pentagram on the panel
//        int yLocation = 10;
//
//        for (int i = 0; i < 5; i++) {
//            x[i] = (int) (Math.cos(i * c * Math.PI / 30 - Math.PI / 2) * (r) + r) + xLocation;
//            y[i] = (int) (Math.sin(i * c * Math.PI / 30 - Math.PI / 2) * (r) + r) + yLocation;
//        }
//        int r_ = (int) (r * Math.sin(18 * Math.PI / 180) / Math
//                .sin(126 * Math.PI / 180)); // Radius of circumscribed circle of inner vertex
//        for (int i = 0; i < 5; i++) {
//            x_[i] = (int) (Math.cos((i * c + 18) * Math.PI / 30 - Math.PI / 2)
//                    * (r_) + r) + xLocation;
//            y_[i] = (int) (Math.sin((i * c + 18) * Math.PI / 30 - Math.PI / 2)
//                    * (r_) + r) + yLocation;
//        }
//            g.setColor(Color.RED);
//            int[] x1 = { x[0], x[2], x_[2] };
//            int[] y1 = { y[0], y[2], y_[2] };
//            int[] x2 = { x[1], x[3], x_[3] };
//            int[] y2 = { y[1], y[3], y_[3] };
//            int[] x3 = { x[2], x[4], x_[4] };
//            int[] y3 = { y[2], y[4], y_[4] };
//            //draw the three identical isosceles triangles.
//            g.fillPolygon(x1, y1, 3);
//            g.fillPolygon(x2, y2, 3);
//            g.fillPolygon(x3, y3, 3);
//


    }
    
    // Getters, do not need to change

     @Override
    public int getX() {
        return myX;
    }

    @Override
    public int getY() {
        return myY;
    }

    @Override
    public int getWidth() {
        return myWidth;
    }

    @Override
    public int getHeight() {
        return myHeight;
    }
}
