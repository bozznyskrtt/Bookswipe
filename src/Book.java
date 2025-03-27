public class Book {
    int bookID;
    String title;
    String author;
    Owner owner; // User or Library
    String genre;
    String description;
    String coverImage;
    String bookCondition;
    boolean isAvailable;
    String availableFor; // swap, lend, buy
    Status status;

    enum Status { AVAILABLE, SWIPED, MATCHED, INTRANSIT }

    public Book(int bookID, String title, String author, Owner owner, String genre, String description, String coverImage, String bookCondition, boolean isAvailable, String availableFor, Status status) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.owner = owner;
        this.genre = genre;
        this.description = description;
        this.coverImage = coverImage;
        this.bookCondition = bookCondition;
        this.isAvailable = isAvailable;
        this.availableFor = availableFor;
        this.status = status;
    }

    public void getName() {
        if (owner instanceof User) {
            System.out.println(((User) owner).getName());
        } else if (owner instanceof Library) {
            System.out.println(((Library) owner).getName());
        } else {
            System.out.println("Unknown owner");
        }
    }

    public Owner getOwner() {
        return this.owner;
    }

    public String getTitle(){
        return this.title;
    }
}