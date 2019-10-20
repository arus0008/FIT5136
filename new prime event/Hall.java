import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
/**
 * Write a description of class Hall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String hallName;
    private String hallAddr;
    private String hallDesc;
    private String hallFunction;
    private double hallPrice;
    private double hallSize;
    private String hallAvailability;
    private String review;

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {
        // initialise instance variables
        hallName = "";
        hallAddr = "";
        hallDesc = "";
        hallFunction = "";
        hallPrice = 100;
        hallSize = 100;
        hallAvailability = "";
        review = ""; 
    }
    
    public Hall(String newName, String newHallAddr, String newHallDesc, String newHallFunc, double newHallPrice, double newHallSize, String newHallAvail)
    {
        hallName = newName;
        hallAddr = newHallAddr;
        hallDesc = newHallDesc;
        hallFunction = newHallFunc;
        hallPrice = newHallPrice;
        hallSize = newHallSize;
        hallAvailability = newHallAvail;
        review = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getHallName()
    {
        // put your code here
        return hallName;
    }
    
    public void setHallName(String newName)
    {
        hallName = newName;
    }
    
    public String getHallAddr()
    {
        return hallAddr;
    }
    
    public void setHallAddr(String newAddr)
    {
        hallAddr = newAddr;
    }
    
    public String getHallDesc()
    {
        return hallDesc;
    }
    
    public void setHallDesc(String newDesc)
    {
        hallDesc = newDesc;
    }
    
    public String getHallFunction()
    {
        return hallFunction;
    }
    
       
    public void setHallFunction(String newFunction)
    {
        hallFunction = newFunction;
    }
    
    public double getHallPrice()
    {
        return hallPrice;
    }
    
    public void setHallPrice(double newPrice)
    {
        hallPrice = newPrice;
    }
    
    public double getHallSize()
    {
        return hallSize;
    }
    
    public void setHallSize(double newSize)
    {
        hallSize = newSize;
    }
    
    public String getHallAvailability()
    {
        return hallAvailability;
    }
    
    public void setHallAvailability(String newAvailability)
    {
        hallAvailability = newAvailability;
    }
    
    public String getHallReview()
    {
        return review;
    }
    
    public void setHallReview(String newReview)
    {
        review = newReview;
    }
    
    public String getFullDetails()
    {
        String details = "Hall Name: " + hallName + "    "
                         + "Hall Address : " + hallAddr + "\n"
                         + "Hall Description :" + hallDesc + "\n"
                         + "Hall Function :" + hallFunction + "\n"
                         + "Hall Price : " + hallPrice + "\n"
                         + "Hall Size : " + hallSize + "\n"
                         + "Hall Availability : " + hallAvailability + "\n"
                         + "Review : " + review;
        // Note: 'votes' is currently included for testing purposes only. In the final
        // application, this will nt be shown. Instead, the vote count will be used to 
        // select and order the comments on screen.
       
        return details;
    }
}
