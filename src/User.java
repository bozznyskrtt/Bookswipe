import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Random;


public class  User implements Owner{
    int userID;
    String username;
    String userPassword;
    String email;
    String address;
    boolean isLibrarian;
    boolean isVerified;
    SubscriptionType subscription;
    List<BookCandidate> bookCandidates;
    Random rand = new Random();
    enum SubscriptionType { SUB, NON_SUB }

    public User(int userID, String username, String userPassword, String email, String address, boolean isLibrarian, boolean isVerified, SubscriptionType subscription) {
        this.userID = userID;
        this.username = username;
        this.userPassword = userPassword;
        this.email = email;
        this.address = address;
        this.isLibrarian = isLibrarian;
        this.isVerified = isVerified;
        this.subscription = subscription;
        this.bookCandidates = new ArrayList<>();
    }

    @Override
    public int getID() {
        return userID;
    }

    @Override
    public String getName() {
        return username;
    }

    public void getBookCandidates() {
        if (bookCandidates.isEmpty()) {
            System.out.println(this.username + " has no book candidates.");
            return;
        }

        System.out.println("Book candidates for " + this.username + ":");
        for (BookCandidate candidate : bookCandidates) {
            String bookTitle = (candidate.bookA != null) ? candidate.bookA.getTitle() : "Unknown Book";
            String userName = (candidate.userA != null) ? candidate.userA.getName() : "Unknown User";
            System.out.println("User: " + userName + " Book: " + bookTitle);
        }
    }

    public void swipeRight(Book book) {
        // 1. Get the owner of the book being swiped
        Owner owner = book.getOwner();

        // 2. Check if the owner is a User (not a Library)
        if (!(owner instanceof User)) return;
        // user = userB
        User bookOwner = (User) owner;

        // 3. Check if bookOwner's bookCandidates list already contains a candidate from 'this'
        boolean found = false;
        for (BookCandidate candidate : bookOwner.bookCandidates) {
            if (candidate.userA.equals(this)) {
                // 4. If yes, it's a match — you and the owner both liked each other's books
                System.out.println("🎉 Match found between " + this.username + " and " + bookOwner.username);
                BookMatch match = new BookMatch(
                        candidate.bookA,               // your book they liked (optional)
                        book,               // their book you liked
                        this,
                        bookOwner,
                        rand.nextInt(9000),
                        LocalDateTime.now(),
                        BookMatch.MatchState.ACCEPTED,
                        null                 // logistics or delivery info
                );
                found = true;
                break;
            }
        }

        // 5. If not found, add yourself to their bookCandidates
        if (!found) {
            BookCandidate candidate = new BookCandidate(book, bookOwner);
            this.bookCandidates.add(candidate);
            System.out.println(this.username + " swiped right on " + book.getTitle() + " by " + bookOwner.username);
        }
    }
}
