package SRP;

public class Library {
    String tittle;
    String Author;
    boolean isAvailable;
    String memberName;
    int memberID;
    // constructor
    public Library(String tittle, String author, boolean isAvailable, String memberName, int memberID) {
        this.tittle = tittle;
        Author = author;
        this.isAvailable = isAvailable;
        this.memberName = memberName;
        this.memberID = memberID;
    }
    // Getters
    public String gettittle() {
        return tittle;
    }
    public String getAuthor() {
        return Author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public String getMemberName() {
        return memberName;
    }
    public int getMemberID() {
        return memberID;
    }
    // methods
    public void lendBook () {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Lending Book: " + this.tittle);
        } else {
            System.out.println("Not Lending Book: " + this.tittle);
        }
    }
    public void returnBook () {
        this.isAvailable = true;
        System.out.println("Returning Book: " + this.tittle+", by "+this.memberID);
    }
    public void borrowBook () {
        this.isAvailable = false;
        System.out.println(this.memberName + " ask to borrow!"+ this.tittle);
        lendBook();
    }
    public void showBookStatus () {
        System.out.println("The book status is " + (isAvailable()?"available":"not available"));
    }
}
