package RefacSRP;

public class Library {
    private Book book;
    private LibraryMember member;

    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }

    public void lendBook () {
        book.lendBook();
    }
    public void showBookStatus () {
        System.out.println("The book status is " + (book.isAvailable()?"available":"not available"));
    }
    public void returnBook () {
       book.returnBook();
    }
}
