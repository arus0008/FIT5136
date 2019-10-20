public class User
{
    private String fname;
    private String lname;
    private String email;
    private String phoneNo;
    private String address;
    private int type;
    private String passwd;
    
    public User()
    {
        fname = "";
        lname = "";
        email = "";
        phoneNo = "";
        address = "";
        type = 1;//1.Customer 2.Owner 3.Admin
        passwd = "";
    }
    
    public User(String newFname, String newLname, String newEmail, String newPhone, String newAddr, int newType, String newPasswd)
    {
        fname = newFname;
        lname = newLname;
        email = newEmail;
        phoneNo = newPhone;
        address = newAddr;
        type = newType;//1.Customer 2.Owner 3.Admin
        passwd = newPasswd;
    }
    public String getFullName()
    {
        String fullName = getFname() + " " + getLname();
        System.out.println(fullName);
        return fullName;
    }
    
    
    public String getFname()
    {
        return fname;
    }
    
    public void setFname(String newFname)
    {
        fname = newFname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public void setLname(String newLname)
    {
        lname = newLname;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    public void setPhone(String newPhone)
    {
        phoneNo = newPhone;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getType()
    {
        return type;
    }
    
    public String getPasswd()
    {
        return passwd;
    }
    
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    public void setType(int newType)
    {
        type = newType;
    }
    
    public void setPasswd(String newPasswd)
    {
        passwd = newPasswd;
    }
}
