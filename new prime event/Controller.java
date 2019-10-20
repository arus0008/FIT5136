import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Controller
{
    // instance variables - replace the example below with your own
    private ListOfBookings bookings;
    private ListOfUsers users;
    private ListOfHalls halls;
    private ListOfQuotations quotations;

    public Controller()
    {
        // initialise instance variables
        bookings = new ListOfBookings();
        users = new ListOfUsers();
        halls = new ListOfHalls();
        quotations = new ListOfQuotations();
    }
    
    public void startApp()
    {
        bookings.readFile();
        users.readFile();
        halls.readFile();
        quotations.readFile();
        welcome();
    }

    public void welcome()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Prime Event!");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Forget Password");
        System.out.println("Please enter 1, 2 or 3 to select：");
        int w = console.nextInt();
        if (w == 1) 
        {
            logIn();
        }
        else if (w == 2) 
        {
            register();
        }
        else if (w == 3) 
        {
            System.out.println("Please enter your email：");
            System.out.println("Your temporary password has been sent to your email to reset your new password.");
            System.out.println("Press 0 to go back");
        }
    } 

    public void logIn()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Letś log you In");
        System.out.println("Please enter email address: ");
        String email = console.nextLine();
        System.out.println("Please enter your password:");
        String passwd = console.nextLine();
        int counter = 0;
        int position = 0;
        for (int i = 0; i<users.getNoOfUsers(); i++)
        {
            if(email.equals(users.getSpecificUsersEmail(i)))
            {
                position = i;
                counter = 1;
                break;
            }
            else
                counter = 0;
        }
        
        if (counter == 1)
        {
            while(!passwd.equals(users.getSpecificUsersPassword(position)))
            {
                //System.out.println("Log in successful!");
                System.out.println("Wrong password!");
                System.out.println("Please enter your password again");
                passwd = console.nextLine();
            }
            System.out.println("Log in successful!");
        }
        else 
        {
            System.out.println("Please go to register!");
            register();
            
        }
               
        if(users.users.get(position).getType() == 1)
        {
                System.out.println("1. View halls");
                System.out.println("2. Select a hall");
                System.out.println("3. Book a hall");
                System.out.println("4. Request for a quotation");
                System.out.println("5. View a booking");
                System.out.println("6. Change a booking");
                System.out.println("7. Cancel a booking");
                System.out.println("8. Write a review");
                System.out.println("Please enter 1-8 to select：");
        }
        else if(users.users.get(position).getType() == 2)
        {
                System.out.println("1. Create a hall");
                System.out.println("2. Update a hall");
                System.out.println("3. Delete a hall");
                System.out.println("4. Update a booking");
                System.out.println("5. View a booking");
                System.out.println("6. Add discount");
                System.out.println("7. Remove discount");
                System.out.println("8. Manage payments");
                System.out.println("9. Confirm a quotation");
                System.out.println("10. Delete a quotation");
                System.out.println("11. Confirm a refund");
                System.out.println("12. Print receipt");
                System.out.println("Please enter 1-12 to select：");
        }
        else if(users.users.get(position).getType() == 3)
        {
                System.out.println("1. Add users");
                System.out.println("2. Update users");
                System.out.println("3. Delete users");
                System.out.println("4. Reset password");
                System.out.println("5. Add discount");
                System.out.println("6. Delete discount");
                System.out.println("7. Identify password");
                System.out.println("8. Identify roles");
                System.out.println("Please enter 1-8 to select：");  
        }
        
    }

    public void register()
    {
        
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your first name：");
        String fname = console.nextLine();
        
        System.out.println("Please enter your last name：");
        String lname = console.nextLine();
        
        System.out.println("Please enter your email：");
        String email = console.nextLine();
        
        System.out.println("Please enter your phone number：");
        String phoneNo = console.nextLine();
        
        System.out.println("Please enter your address：");
        String address = console.nextLine();
        
        System.out.println("Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
        int type = console.nextInt();
        while(type != 1 && type != 2 && type != 3)
        {
            System.out.println("Error!Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
            type = console.nextInt();
        }
        
        System.out.println("Please enter your password：");
        String passwd1 = console.next();
        System.out.println("Please confirm your password：");
        String passwd2 = console.next();
        while (!passwd1.equals(passwd2))
        {
            System.out.println("Your passwords entered are not same.");
            System.out.println("Please enter your password：");
            passwd1 = console.nextLine();
            System.out.println("Please confirm your password：");
            passwd2 = console.nextLine();
        }
        String passwd = passwd1;
        users.addUser(fname, lname, email, phoneNo, address, type, passwd);
        users.writeFile();
        logIn();

    }

    public void logOut()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Are you sure to log out? \n 1: Continue to log out; \n 2: Back to last step.");
        System.out.println("Please enter 1-2 to continue.");
        int o=console.nextInt();
        if (o == 1){
            System.out.println("See ya~~~");

        }
        else if (o == 2){
            System.out.println("Auto jump back to previous page...");

        }

    }

    public void requestQuotation()
    {
        //ArrayList<String> quotation = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the hall name: ");
        String name = console.nextLine();
        //quotation.add(0,name);

        System.out.println("Enter the date(dd/mm/yyyy): ");
        String date = console.nextLine();
        //quotation.add(1,date);

        System.out.println("Enter the time(hh): ");
        String time = console.nextLine();
        //quotation.add(2,time);

        System.out.println("Do you need catering? \n 1: Yes, I do.(Need to pay extra 20 dollars.); \n 2: No, I don't.");
        int c = console.nextInt();
        int price = 0;
        if (c == 1){
            System.out.println("Ctering had been selected. 20 dollars added");
            price = 20;

        }
        else if (c == 2){
            System.out.println("Add $0");

        }
        String catering = console.nextLine();
        //quotation.add(3,catering);
        
        quotations.addQuotation(name, date, time, c, price);
        quotations.writeFile();
        int index = quotations.getNoOfQuotations() - 1;

        System.out.println("The final price is: " + quotations.getSpecificQuotationsPrice(index));
        //How can I add the price?
        System.out.println("Are you sure to continue? \n 1: Yes, I will book this hall; \n 2: No, back to last step.");
        System.out.println("Please enter 1-2 to continue.");
        int q=console.nextInt();
        if (q == 1){
            System.out.println("Auto jump to Booking the hall...");
            bookHall();
        }
        else if (q== 2){
            System.out.println("Auto jump back to previous page...");

        }
    }

    public void bookHall()
    {
        quotations.display();
        System.out.println("Enter the number of quatation to book a hall.");
        System.out.println("Enter 0 to exit.");
        Scanner console = new Scanner(System.in);
        int quotation = console.nextInt();
        if(quotation == 0)
        {

        }
        else
        {
            System.out.println("Quotation " + quotation+ "has been selected");
            System.out.println("You have selected : " + quotations.getSpecificQuotationsName(quotation - 1)+ " Please pay : " + quotations.getSpecificQuotationsPrice(quotation - 1));
            System.out.println("Please enter you card number to pay a deposit:");
            String cardNo = console.nextLine();
            System.out.println("Please enter you PIN:");
            int pin = console.nextInt();
            System.out.println("Transaction successful!");
            System.out.println("Booking successful!");
            String name = quotations.getSpecificQuotationsName(quotation - 1);
            String date = quotations.getSpecificQuotationsDate(quotation - 1);
            String time = quotations.getSpecificQuotationsTime(quotation - 1);
            int status = 3;
            bookings.addBooking(name, date, time, status);
            bookings.writeFile();
            
        }
    }
    
    public void writeReview()
    {
        halls.display();
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the hall name you widh to write a review on");
        String hallName=console.nextLine();
        String review = "";
        int counter = 0;
        int position = 0;
        for (int i = 0; i<halls.getNoOfHalls(); i++)
        {
            if(hallName.equals(halls.getSpecificHallsName(i)))
            {
                position = i;
                counter = 1;
                break;
                
                
            }
            else
                counter = 0;
        }
        
        if (counter == 1)
        {
            System.out.println("Please write a review : ");
            review = console.nextLine();
            halls.setSpecificHallsReview(position, review);
            System.out.println("Log in successful!");
        }
        
    }
    
    public void searchHallInput()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter 1, 2, 3  OR 4 if you want to search halls by: 1.NAME 2. FUNCTION 3.ADDRESS 4.AVAILABILITY  ");
        String type = console.nextLine();
        switch (type)
        {
            case "1":
            System.out.println("Please enter a Keyword to search");
            String name = console.nextLine();
            halls.findHallByName(name);
            break;
            
            case "2":
            System.out.println("Please enter a Keyword to search");
            String function = console.nextLine();
            halls.findHallByFunction(function);
            break;
            
            case "3":
            System.out.println("Please enter a Keyword to search");
            String address = console.nextLine();
            halls.findHallByAddr(address);
            break;
            
            case "4":
            System.out.println("Please enter a Keyword to search");
            String availability = console.nextLine();
            halls.findHallByAvail(availability);
            break;
        }
        
    }
}