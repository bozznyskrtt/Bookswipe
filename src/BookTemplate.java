import java.util.ArrayList;
import java.util.List;

public class BookTemplate {
    private String title;
    private String author;
    private String genre;
    private String description;
    private String coverImage;
    private List<Book> books;

    public BookTemplate(String title, String author, String genre, String description, String coverImage) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.coverImage = coverImage;
        this.books = new ArrayList<>();
    }

    public void addbook(Book book){
        books.add(book);
    }
    public List<Book> getbook() {
        return books;
    }


    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getDescription() { return description; }
    public String getCoverImage() { return coverImage; }
}