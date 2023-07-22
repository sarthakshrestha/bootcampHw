package invoicecustomer;

public class Customer{
    int id;
    String name;
    int discount;

    //Constructor for customer
    Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    //Setters
    void setId(int id){
        this.id = id;
    }

    void setDiscount(int discount){
        this.discount = discount;
    }

    @Override
    public String toString(){
        return "Customer " + " with an id of " + id + " receives a discount of " + discount;
    }
}
