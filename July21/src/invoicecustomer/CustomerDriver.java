package invoicecustomer;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer Ram = new Customer(1423, "Ram", 50);
        Invoice inv = new Invoice(10, Ram, 23);

        System.out.println(Ram.toString());
        System.out.println(inv.toString());
    }
}
