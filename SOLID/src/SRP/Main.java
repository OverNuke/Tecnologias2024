package SRP;

public class Main {
    public static void main(String[] args) {
        Library USBI = new Library("Moby Dick","John (Maybe)",true,"Julie",732124);
        USBI.showBookStatus();
        USBI.borrowBook();
        USBI.showBookStatus();

    }
}
