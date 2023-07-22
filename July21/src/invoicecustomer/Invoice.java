package invoicecustomer;

public class Invoice{
    String name;
    public int id;
    public Customer customer;
    double amount;

    Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    void setAmount(double amount){
        this.amount = amount;
    }

    //Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getAmount(){
        return amount;
    }

    // Overriding to string
    @Override
    public String toString(){
        return "The customer with an id of " + id + " is called " + customer +
                " and must pay an amount of " + amount ;
    }
}
