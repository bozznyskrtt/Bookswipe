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
    boolean isVerified;
    SubscriptionType subscription;
    List<BookCandidate> bookCandidates;
    enum SubscriptionType { SUB, NON_SUB }
    List<BookMatch> matches = new ArrayList<>();
    Random rand = new Random();


    public User(int userID, String username, String userPassword, String email, String address, boolean isVerified, SubscriptionType subscription) {
        this.userID = userID;
        this.username = username;
        this.userPassword = userPassword;
        this.email = email;
        this.address = address;
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
            String bookTitle = (candidate.bookA != null) ? candidate.bookA.getTemplate().getTitle() : "Unknown Book";
            String userName = (candidate.userA != null) ? candidate.userA.getName() : "Unknown User";
            System.out.println("User: " + userName + " Book: " + bookTitle);
        }
    }

    public Book addswapbook( String title, String author, String genre, String description, String coverImage, String bookCondition) {
        BookTemplate template = null;

        // Check if template exists
        for (BookTemplate t : TemplateManager.allTemplates) {
            if (t.getTitle().equalsIgnoreCase(title) && t.getAuthor().equalsIgnoreCase(author)) {
                template = t;
                break;
            }
        }

        // If not found, create a new one and add to the global list
        if (template == null) {
            template = new BookTemplate(title, author, genre, description, coverImage);
            TemplateManager.allTemplates.add(template);
        }

        // Create the actual book
        Book book = new Book(rand.nextInt(9000), template, this, bookCondition, true, "swap", Book.Status.AVAILABLE);
        template.addbook(book);
        return book;
    }

    public void createBookMatch(Book bookA, Book bookB, User userA, User userB){
        BookMatch match = new BookMatch(
                bookA,
                bookB,
                userA,
                userB,
                rand.nextInt(9000),
                LocalDateTime.now(),
                BookMatch.MatchState.ACCEPTED,
                null                 // logistics or delivery info
        );
        this.matches.add(match);
        userB.matches.add(match);
    }

    public void swipeRight(String name, String author) {
        // Loop through all books under this template
        BookTemplate template = TemplateManager.getTemplate(name, author);

        for (Book book : template.getbook()) {
            Owner owner = book.getOwner();

            // We only care about other users (not myself or a library)
            if (!(owner instanceof User) || owner.equals(this)) continue;

            User bookOwner = (User) owner;

            // Check if that user has already swiped right on one of MY books
            //candidate of that book
            boolean mutual = false;
            for (BookCandidate candidate : bookOwner.bookCandidates) {
                if (candidate.userA.equals(this)) {
                    mutual = true;
                    System.out.println("✅ Match between " + this.username + " and " + bookOwner.username);
                    createBookMatch(candidate.bookA,book,this,bookOwner);
                }
            }

            if (!mutual) {
                BookCandidate candidate = new BookCandidate(book, bookOwner);
                this.bookCandidates.add(candidate);
                System.out.println(this.username + " swiped right on " + bookOwner.getName() + "'s book.");
            }
        }
    }
}
