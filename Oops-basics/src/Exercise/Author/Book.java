package Exercise.Author;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty;

    @Override
    public String toString() {
        return "Book[" +
               "isbn = "+ this.isbn+", "+
                "name = "+this.name+", "+
                this.author+", "+
                "price = "+ this.price+", "+
                "qty = "+this.qty+
                "]";
    }

    public String getName() {
        return name;
    }
    public String getIsbn(){
        return this.isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
}
