import java.util.Scanner;
public class LibraryBook {
    final String isbn;
    String title;
    String author;
    double price;
    LibraryBook(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("\n----- Book Details -----");
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rs. " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();
        LibraryBook book = new LibraryBook(isbn, title, author, price);
        book.display();
        sc.close();
    }
}