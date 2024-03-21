public class AstronautBuilder {
    // Create your fields for name, age, address, and phone number.
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    //The setName method sets the person's name.
    public void setName(String name) 
    {
        this.name = name;
    }
    
    //The setAge method sets the person's age.
    public void setAge(int age)
    {
        this.age = age;
    }

    //The setAddress method sets the person's address.
    public void setAddress(String address)
    {
        this.address = address;
    }

    //The setPhone method sets the person's phone number.
    public void setPhone(String phone)
    {
        this.phoneNumber = phone;
    }

    //The getName method returns the person's name.
    public String getName()
    {
        return this.name;
    }

    //The getAge method returns the person's age.
    public int getAge()
    {
        return this.age;
    }

    //The getAdress method returns the person's address.
    public String getAddress()
    {
        return this.address;
    }

    //The getPhone method returns the person's phone number.
    public String getPhone()
    {
        return this.phoneNumber;
    }

}