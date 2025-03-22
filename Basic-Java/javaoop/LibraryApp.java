import project.Book;
import project.Library;
import project.StaffMember;
import project.Member;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Menambahkan Books
        Book book1 = new Book(101, "Java Programming", "James Gosling", 3);
        Book book2 = new Book(102, "Python for Beginners", "Guido van Rossum", 2);
        Book book3 = new Book(103, "Data Structures", "Robert Lafore", 1);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Mendaftarkan Members
        Member member1 = new project.Member(1, "Alice");
        StaffMember staff1 = new StaffMember(2, "Bob", "Librarian");

        library.registerMember(member1);
        library.registerMember(staff1);

        // Meminjam buku
        System.out.println("\nMember borrowing a book:");
        if (member1.borrowBook(book1)) {
            System.out.println("Alice borrowed 'Java Programming'");
        } else {
            System.out.println("Book not available.");
        }

        // Staff meminjam buku
        System.out.println("\nStaff borrowing a book:");
        if (staff1.borrowBook(book2)) {
            System.out.println("Bob borrowed 'Python for Beginners'");
        }

        System.out.println("\nAvailable books in the library:");
        library.displayAvailableBooks();

        // Mengembalikan buku
        System.out.println("\nReturning a book:");
        member1.returnBook(book1);
        System.out.println("Alice returned 'Java Programming'");

        System.out.println("\nAvailable books after return:");
        library.displayAvailableBooks();
    }
}
