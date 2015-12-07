public class Customer
{
    private String name;
    private double sale;
    public Customer(String customerName, double amount)
    {
        this.name = customerName;
        this.sale = amount;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double getAmount()
    {
        return this.sale;
    }
}