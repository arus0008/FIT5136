import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
/**
 * Write a description of class HallController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfHalls
{
    // instance variables - replace the example below with your own
    public ArrayList<Hall> halls;
    /**
     * Constructor for objects of class HallController
     */
    public ListOfHalls()
    {
        // initialise instance variables
        halls = new ArrayList<Hall>(10);
    }
    
    public ListOfHalls(ArrayList<Hall> newHalls)
    {
        halls = newHalls;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void readFile() //chnage void to STring and return something
    {
        String filename = ("halls.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    
                    String[] hallValues = parser.nextLine().split(",");
                    String hallName = hallValues[0];
                    String hallAddr = hallValues[1];
                    String hallDesc = hallValues[2];
                    String hallFunction = hallValues[3];
                    String hallPrice = hallValues[4];
                    String hallSize = hallValues[5];
                    String hallAvailability = hallValues[6];
                    String hallReview = hallValues[7];

                    Hall hall = new Hall(hallName, hallAddr, hallDesc, hallFunction, Double.parseDouble(hallPrice), Double.parseDouble(hallSize), hallAvailability);
                    hall.setHallReview(hallReview);
                    halls.add(hall);

                }
            }
            finally
            {
                System.out.println("Updating halls");
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(filename + "not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occured");
        }
    }
        
    public void findHallByFunction(String keyword)
    {
        for (int i = 0; i<getNoOfHalls(); i++)
        {
            if(keyword.equals(getSpecificHallsFunction(i)))
            {
                
                System.out.println(getSpecificHallsName(i) + 
                                    ", "+ getSpecificHallsAddr(i) + 
                                    ", " + getSpecificHallsDesc(i) + 
                                    ", " + getSpecificHallsFunction(i)+
                                    ", " + getSpecificHallsPrice(i) +
                                    ", " + getSpecificHallsSize(i) + 
                                    ", " + getSpecificHallsAvail(i) +
                                    ", " + getSpecificHallsReview(i));
                
                
            }
            
            else
                continue;
            
            
        }
    }
    
    public void findHallByName(String keyword)
    {
                
        for (int i = 0; i<getNoOfHalls(); i++)
        {
            if(keyword.equals(getSpecificHallsName(i)))
            {
                
                System.out.println(getSpecificHallsName(i) + 
                                    ", "+ getSpecificHallsAddr(i) + 
                                    ", " + getSpecificHallsDesc(i) + 
                                    ", " + getSpecificHallsFunction(i)+
                                    ", " + getSpecificHallsPrice(i) +
                                    ", " + getSpecificHallsSize(i) + 
                                    ", " + getSpecificHallsAvail(i) +
                                    ", " + getSpecificHallsReview(i));
                
                
            }
            
            else
                continue;
            
            
        }
    }
    
    public void findHallByAddr(String keyword)
    {
               
        for (int i = 0; i<getNoOfHalls(); i++)
        {
            if(keyword.equals(getSpecificHallsAddr(i)))
            {
                
                System.out.println(getSpecificHallsName(i) + 
                                    ", "+ getSpecificHallsAddr(i) + 
                                    ", " + getSpecificHallsDesc(i) + 
                                    ", " + getSpecificHallsFunction(i)+
                                    ", " + getSpecificHallsPrice(i) +
                                    ", " + getSpecificHallsSize(i) + 
                                    ", " + getSpecificHallsAvail(i) +
                                    ", " + getSpecificHallsReview(i));
                
                
            }
            
            else
                continue;
            
            
        }
    }
    
    public void findHallByAvail(String keyword)
    {
        for (int i = 0; i<getNoOfHalls(); i++)
        {
            if(keyword.equals(getSpecificHallsAvail(i)))
            {
                
                System.out.println(getSpecificHallsName(i) + 
                                    ", "+ getSpecificHallsAddr(i) + 
                                    ", " + getSpecificHallsDesc(i) + 
                                    ", " + getSpecificHallsFunction(i)+
                                    ", " + getSpecificHallsPrice(i) +
                                    ", " + getSpecificHallsSize(i) + 
                                    ", " + getSpecificHallsAvail(i) +
                                    ", " + getSpecificHallsReview(i));
                
                
            }
            
            else
                continue;
            
            
        }
    }
    
    public int getNoOfHalls()
    {
        return halls.size();
    }
    
       
    public void display()
    {
        for(int i = 0; i < getNoOfHalls(); i++)
        {
            System.out.println(halls.get(i).getFullDetails());
        }
    }
    
    public String getSpecificHallsName(int index) throws NullPointerException
    {
        return halls.get(index).getHallName();
    }
    
    public String getSpecificHallsAddr(int index) throws NullPointerException
    {
        return halls.get(index).getHallAddr();
    }
    
    public String getSpecificHallsDesc(int index) throws NullPointerException
    {
        return halls.get(index).getHallDesc();
    }
    
    public String getSpecificHallsFunction(int index) throws NullPointerException
    {
        return halls.get(index).getHallFunction();
    }
    
    public Double getSpecificHallsPrice(int index) throws NullPointerException
    {
        return halls.get(index).getHallPrice();
        
    }
    
    public Double getSpecificHallsSize(int index) throws NullPointerException
    {
        return halls.get(index).getHallSize();
        
    }
    
    public String getSpecificHallsAvail(int index) throws NullPointerException
    {
        return halls.get(index).getHallAvailability();
    }
    
    public String getSpecificHallsReview(int index) throws NullPointerException
    {
        return halls.get(index).getHallReview();
    }
    
    
    public void setSpecificHallsReview(int index, String review) throws NullPointerException
    {
        halls.get(index).setHallReview(review);
    }
    
    
}
