import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
//import java.sql.Timestamp;

public class Booking
{
    //private Timestamp bookingNo;
    private String name;
    private String date;
    private String time;
    private int status;//1.Ongoing 2. Complished 3. Future date
    //private ArrayList<Review> reviews;
    

    public Booking()
    {
        //Timestamp bookingNo = ;
        name = "";
        date = "";
        time = "";
        status = 1; 
        //reviews = new ArrayList<>();
    }
    
    public Booking(String newName, String newDate, String newTime, int newStatus)
    {
        //Timestamp bookingNo = ;
        name = newName;
        date = newDate;
        time = newTime;
        status = newStatus; 
        //reviews = new ArrayList<>();
    }
    
    /**
     * Return the number of customer comments for this item.
     
    public int getNumberOfReviews()
    {
        return reviews.size();
    }
    */
    
    /**
     * Add a comment to the comment list of this sales item. Return true if successful;
     * false if the comment was rejected.
     * 
     * The comment will be rejected if the same author has already left a comment, or
     * if the rating is invalid. Valid ratings are numbers between 1 and 5 (inclusive).
     
    public boolean addReview(String author, String text)
    {
        //if(getStatus() == 1) {  // reject review
          //  return false;
        //}
        
        reviews.add(new Review(author, text));
        return true;
    }
    */
    
    /**
     * Remove the comment stored at the index given. If the index is invalid, do nothing.
     
    public void removeComment(int index)
    {
        if(index >=0 && index < reviews.size()) { // if index is valid
            reviews.remove(index);
        }
    }
    */

    
    
    /*
    //public Timestamp getBookingNo()
    //{
        //return bookingNo;
    //}*/
    public String getName()
    {
        return name;
    }
    
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public int getStatus()
    {
        return status;
    }
    
    
    // public void setBookingNo(Timestamp newBookingNo)
    // {
        // //bookingNo = newBookingNo;
    // }
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setDate(String newDate)
    {
        date = newDate;
    }
    public void setTime(String newTime)
    {
        time = newTime;
    }
    public void setStatus(int newStatus)
    {
        status = newStatus;
    }
}
