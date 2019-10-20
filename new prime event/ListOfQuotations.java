import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class ListOfQuattions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfQuotations
{
    // instance variables - replace the example below with your own
    public ArrayList<Quotation> quotations;

    /**
     * Constructor for objects of class ListOfQuattions
     */
    public ListOfQuotations()
    {
        // initialise instance variables
        quotations = new ArrayList<Quotation>(5);
    }

    public ListOfQuotations(ArrayList<Quotation> newQuotations)
    {
        // initialise instance variables
        quotations = newQuotations;
    }

    public void addQuotation(String newName, String newDate, String newTime, int newCatering, int newPrice)
    {
        //User racer = new User();
        quotations.add(new Quotation(newName, newDate, newTime, newCatering, newPrice));
    }

    public ArrayList<Quotation> getListOfQuotations()
    {
        return quotations;
    }
    
    public int getNoOfQuotations()
    {
        return quotations.size();
    }
    
    
    //public int getSerialNo()
    //{
      //  return Quotation.getSerialNo();
    //}

    public Quotation getSpecificQuotation(int index) throws NullPointerException
    {
        return quotations.get(index);
    }

    public String getSpecificQuotationsName(int index) throws NullPointerException
    {
        return quotations.get(index).getName();
    }
    
    public String getSpecificQuotationsTime(int index) throws NullPointerException
    {
        return quotations.get(index).getTime();
    }
    
    public String getSpecificQuotationsDate(int index) throws NullPointerException
    {
        return quotations.get(index).getDate();
    }
    
    public int getSpecificQuotationsCatering(int index) throws NullPointerException
    {
        return quotations.get(index).getCatering();
    }
    
    public int getSpecificQuotationsPrice(int index) throws NullPointerException
    {
        return quotations.get(index).getPrice();
    }

    public void readFile() //chnage void to STring and return something
    {
        String filename = ("Quotation.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] quotationValues = parser.nextLine().split(",");
                    //String bookingNo = bookingValues[0];
                    String name = quotationValues[0];
                    String date = quotationValues[1];
                    String time = quotationValues[2];
                    String catering = quotationValues[3];
                    String price = quotationValues[4];

                    Quotation quotation = new Quotation();
                    //booking.setBookingNo(bookingNo);
                    quotation.setName(name);
                    quotation.setDate(date);
                    quotation.setTime(time);
                    quotation.setCatering(Integer.parseInt(catering));
                    //Plz check change String to boolean value--setCatering() is right or not?
                    quotation.setPrice(Integer.parseInt(price));

                    quotations.add(quotation);

                }
            }
            finally
            {
                System.out.println("Quotations being set up");
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
        String filename = "Quotation.txt";
        int index = getNoOfQuotations() - 1;
        try
        {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.newLine();
            bw.write(getSpecificQuotationsName(index) + 
                      "," + getSpecificQuotationsDate(index) + 
                      "," + getSpecificQuotationsTime(index) +
                      "," + getSpecificQuotationsCatering(index) +
                      "," + getSpecificQuotationsPrice(index));
            //bw.write() need to add boolean value getCatering() and int value getPrice()
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
    
    public void display()
    {
        for(int i = 0; i < getNoOfQuotations(); i++)
        {
            System.out.println(i+1 + " " + getSpecificQuotationsName(i) + 
                      " " + getSpecificQuotationsDate(i) + 
                      " " + getSpecificQuotationsTime(i) +
                      " " + getSpecificQuotationsCatering(i) +
                      " " + getSpecificQuotationsPrice(i));
        }
    }
}
