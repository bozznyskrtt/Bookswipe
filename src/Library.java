import java.util.List;

public class Library implements Owner {
    int libraryID;
    String name;
    String location;
    List<Book> books;
    int borrowLimit;
    int borrowDuration;

    public Library(int libraryID, String name, String location, List<Book> books, int borrowLimit, int borrowDuration) {
        this.libraryID = libraryID;
        this.name = name;
        this.location = location;
        this.books = books;
        this.borrowLimit = borrowLimit;
        this.borrowDuration = borrowDuration;
    }



    @Override
    public int getID() {
        return libraryID;
    }

    @Override
    public String getName() {
        return name;
    }
}