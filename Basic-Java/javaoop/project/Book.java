package project;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public boolean borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        availableCopies++;
    }

    public String getTitle() {
        return title;
    }    

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available Copies: " + availableCopies;
    }
}
