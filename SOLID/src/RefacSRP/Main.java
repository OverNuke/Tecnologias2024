package RefacSRP;

public class Main {
    public static void main(String[] args) {
        Book libro = new Book("Python for dummies","Jeff",true);
        LibraryMember member = new LibraryMember ("Tom",813247);
        Library USBI = new Library(libro,member);
        USBI.showBookStatus();
        USBI.returnBook();
    }
}
