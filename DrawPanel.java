package com.example.visual_laboation2;

import com.example.cars.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    // Just a single image, TODO: Generalize
    BufferedImage volvoImage;
    BufferedImage saabImage;
    BufferedImage scaniaImage;
    // To keep track of a singel cars position
    Point volvoPoint = new Point();
    Point saabPoint = new Point();
    Point scaniaPoint = new Point();


    // TODO: Make this genereal for all cars
    void moveVolvo(int x, int y) {
        volvoPoint.x = x;
        volvoPoint.y = y;
    }

    void moveSaab(int x, int y) {
        saabPoint.x = x;
        saabPoint.y = y;
    }

    void moveScania(int x, int y) {
        scaniaPoint.x = x;
        scaniaPoint.y = y;
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(new FileInputStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(new FileInputStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(new FileInputStream("pics/Scania.jpg"));

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        g.drawImage(saabImage, saabPoint.x, saabPoint.y + 100, null);
        g.drawImage(scaniaImage, scaniaPoint.x, scaniaPoint.y + 200, null); // see javadoc for more info on the parameters

    }
}
