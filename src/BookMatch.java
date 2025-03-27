import java.time.LocalDateTime;

public class BookMatch extends BookCandidate{
    int matchID;
    LocalDateTime createdAt;
    MatchState state;
    Logistics deliveryInfo;
    User userB;
    Book bookB;

    enum MatchState { PENDING, ACCEPTED, REJECTED }

    public BookMatch(Book bookA, Book bookB, User userA, User userB, int matchID, LocalDateTime createdAt, MatchState state, Logistics deliveryInfo) {
        super(bookA, userA);
        this.bookB = bookB;
        this.userB =userB;
        this.matchID = matchID;
        this.createdAt = createdAt;
        this.state = state;
        this.deliveryInfo = deliveryInfo;
    }
}