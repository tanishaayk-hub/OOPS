class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    Book(int bookId, String title, String author, String category,
         double price, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    void displayBookDetails() {
        System.out.println("BookId: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

public class LibraryManagement
 {
    public static void main(String[] args) {

        Book b1 = new Book(
            101,
            "C Programming",
            "Tom",
            "Computer Science",
            650,
            true
        );

        Book b2 = new Book(
            102,
            "Java",
            "Erich",
            "Computer Science",
            600,
            false
        );

        System.out.println("Library Book Details");
        System.out.println("--------------------");

        b1.displayBookDetails();

        System.out.println();

        b2.displayBookDetails();
    }
}