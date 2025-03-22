package project;

public interface Borrowable {
    boolean borrowBook(Book book);
    void returnBook(Book book);
}
