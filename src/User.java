import java.util.List;

public class  User implements Owner{
    int userID;
    String username;
    String userPassword;
    String email;
    String address;
    boolean isLibrarian;
    boolean isVerified;
    SubscriptionType subscription;

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
    }

    @Override
    public int getID() {
        return userID;
    }

    @Override
    public String getName() {
        return username;
    }
}
