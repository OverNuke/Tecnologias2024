package RefacSRP;

public class Book {
    private String tittle;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.tittle = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    // Getters
    public String getTitle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    // Methods
    public void lendBook () {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Lending Book: " + tittle);
        } else {
            System.out.println("Not Lending Book: " + this.tittle);
        }
    }
    public void returnBook () {
        this.isAvailable = true;
        System.out.println("Returning Book: " + this.tittle);
    }
}
