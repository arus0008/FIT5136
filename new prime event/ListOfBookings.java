import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Write a description of class ListOfBookings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfBookings
{
    // instance variables - replace the example below with your own
    private ArrayList<Booking> bookings;

    /**
     * Constructor for objects of class ListOfBookings
     */
    public ListOfBookings()
    {
        // initialise instance variables
        bookings = new ArrayList<Booking>(5);
    }
    
    public ListOfBookings(ArrayList<Booking> newBookings)
    {
        // initialise instance variables
        bookings = newBookings;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addBooking()
    {
        //Booking b = new Booking();
        //b.add(new Booking());
    }
    
    public ArrayList<Booking> getListOfBookings()
    {
        return bookings;
    }
    
    public Booking getSpecificBooking(int index) throws NullPointerException
    {
        return bookings.get(index);
    }
    
    public String getSpecificBookingsName(int index) throws NullPointerException
    {
        return bookings.get(index).getName();
    }
    
    public int getNoOfBookings()
    {
        return bookings.size();
    }
    
    public String getSpecificBookingsDate(int index) throws NullPointerException
    {
        return bookings.get(index).getDate();
    }
    
    public String getSpecificBookingsTime(int index) throws NullPointerException
    {
        return bookings.get(index).getTime();
    }
    
    public int getSpecificBookingsStatus(int index) throws NullPointerException
    {
        return bookings.get(index).getStatus();
    }
    
    public void addBooking(String newName, String newDate, String newTime, int newStatus)
    {
        //User racer = new User();
        bookings.add(new Booking(newName, newDate, newTime, newStatus));
    }
    
    public void readFile() //chnage void to STring and return something
    {
        String filename = ("Booking.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] bookingValues = parser.nextLine().split(",");
                    //String bookingNo = bookingValues[0];
                    String name = bookingValues[0];
                    String date = bookingValues[1];
                    String time = bookingValues[2];
                    String status = bookingValues[3];
                    
                    

                    Booking booking = new Booking();
                    //booking.setBookingNo(bookingNo);
                    booking.setName(name);
                    booking.setDate(date);
                    booking.setTime(time);
                    booking.setStatus(Integer.parseInt(status));
                    

                    bookings.add(booking);

                }
            }
            finally
            {
                System.out.println("Bookings being set up");
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
    
    public void writeFile()
    {
        String filename = "Booking.txt";
        int index = getNoOfBookings() -1;
        try
        {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.newLine();
            bw.write(getSpecificBookingsName(index) + 
                      "," + getSpecificBookingsDate(index) + 
                      "," + getSpecificBookingsTime(index) +
                      "," + getSpecificBookingsStatus(index));
            bw.flush();
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
}
