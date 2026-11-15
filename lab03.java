class Book
{
    int bookID;
    String title;
    String author;
    double price;

    static int count = 0;
    Book(int bookID, String title, String author, double price)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }
    void display()
    {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    void search(int id)
    {
        if (bookID == id)
            System.out.println("Book found: " + title);
        else
            System.out.println("Book ID not matched.");
    }

    void search(String title)
    {
        if (this.title.equalsIgnoreCase(title))
            System.out.println("Book found: " + this.title);
        else
            System.out.println("Book title not matched.");
    }
    Book costlierBook(Book b)
    {
        if (this.price >= b.price)
            return this;
        else
            return b;
    }

    static void totalBooks()
    {
        System.out.println("Total books created: " + count);
    }
}

public class lab2
{
    public static void main(String[] args)
    {

        Book b1 = new Book(101, "Java Programming", "James Gosling", 550);
        Book b2 = new Book(102, "Data Structures", "Seymour Lipschutz", 450);
        Book b3 = new Book(103, "Python Basics", "Guido van Rossum", 600);

        System.out.println("Book Details:");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("Search by Book ID:");
        b1.search(101);

        System.out.println("\nSearch by Title:");
        b2.search("Data Structures");

        Book expensive = b1.costlierBook(b3);
        System.out.println("\nCostlier Book:");
        expensive.display();

        Book.totalBooks();
    }
}