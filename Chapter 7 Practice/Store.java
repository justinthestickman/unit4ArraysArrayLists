import java.util.ArrayList;
import java.util.Scanner;

public class Store
{
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    public void addSale(String customerName, double amount)
    {
        Customer customer = new Customer(customerName, amount);
        customers.add(customer);
    }
    
    public String nameOfBestCustomer()
    {
        Customer bestCustomer = new Customer(" ",0);
        double largestSale = 0;
        for (Customer customer : customers)
        {
            double sale = customer.getAmount();
            if (sale > largestSale)
            {
                largestSale = sale;
                bestCustomer = customer;
            }
        }
        return bestCustomer.getName();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        String name;
        double price;
        do
        {
            System.out.print("Name of Customer and Price (separated by a space): ");
            name = scanner.next();
            price = scanner.nextDouble();
            if (price != 0)
            {
                store.addSale(name,price);
            }
        }
        while (price != 0);
        System.out.println("Best Customer: " + store.nameOfBestCustomer());
    }
}