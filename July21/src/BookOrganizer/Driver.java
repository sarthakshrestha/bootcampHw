package BookOrganizer;

public class Driver {
    public static void main(String[] args) {
        Author ShivaJi = new Author("Gauraj", "joshi@email.com");
        Book book = new Book("1569", "Premras", ShivaJi, 246.123, 43);
        System.out.println(ShivaJi.toString());
        System.out.println(book.toString());
    }
}
