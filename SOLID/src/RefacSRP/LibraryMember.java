package RefacSRP;

public class LibraryMember {
    private String name;
    private int memberID;

    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }
    public String getName() {
        return name;
    }
    public int getMemberID() {
        return memberID;
    }
    public void returnBook (Book book) {
        book.returnBook();
    }
    public void borrowBook (Book book) {
        book.lendBook();

    }
}
