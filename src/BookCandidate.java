import java.time.LocalDateTime;

public class BookCandidate {
    Book bookA;
    Book bookB;
    User userA;
    User userB;

    public BookCandidate(Book bookA, Book bookB, User userA, User userB) {
        this.bookA = bookA;
        this.bookB = bookB;
        this.userA = userA;
        this.userB = userB;
    }
}