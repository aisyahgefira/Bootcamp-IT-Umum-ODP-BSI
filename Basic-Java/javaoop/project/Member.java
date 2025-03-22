package project;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Borrowable {
    protected List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        super(memberId, name);
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public boolean borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Member ID: " + id + ", Name: " + name);
    }
}
