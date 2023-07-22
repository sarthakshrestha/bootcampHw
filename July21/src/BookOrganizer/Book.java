package BookOrganizer;

public class Book extends Author{
    String isbn;
    String name;
    public Author author;
    double price;

    int qty;

    Book(){
        name = "The book of Gabagoo";
    }

    Book(String isbn, String name, Author author, double price, int qty){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Getter
    public String getIsbn(){
        return isbn;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public Author getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "Author: " + author + " Book name " + name + " ISBN: " + isbn + " Price: " + price + " Quantity: " + qty;
    }
}
