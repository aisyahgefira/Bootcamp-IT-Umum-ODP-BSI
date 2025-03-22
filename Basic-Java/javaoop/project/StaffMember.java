package project;

public class StaffMember extends Member{
    private String position;

    public StaffMember(int memberId, String name, String position) {
        super(memberId, name);
        this.position = position;
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
    public void displayInfo() {
        System.out.println("Staff ID: " + id + ", Name: " + name + ", Position: " + position);
    }
}
