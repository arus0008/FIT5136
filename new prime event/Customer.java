import java.util.ArrayList;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends User
{
    private ArrayList<String> customer;

    public Customer()
    {
        customer = new ArrayList<>();
    }

    public Customer(ArrayList<String> customer)
    {
        this.customer = customer;
    }
    
    public ArrayList<String> getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(ArrayList<String> customer)
    {
        this.customer = customer;
    }
}
