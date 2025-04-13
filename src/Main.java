public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        User user1 = new User(1, "alice", "passAlice", "alice@example.com", "123 Wonderland Ave",  true, User.SubscriptionType.SUB);
        User user2 = new User(2, "bob", "passBob", "bob@example.com", "456 Maple Street", true, User.SubscriptionType.NON_SUB);
        User user3 = new User(3, "charlie", "passCharlie", "charlie@example.com", "789 Oak Road", true,  User.SubscriptionType.SUB);
        User user4 = new User(4, "diana", "passDiana", "diana@example.com", "321 Birch Lane",  true, User.SubscriptionType.SUB);
        User user5 = new User(5, "edward", "passEdward", "edward@example.com", "654 Cedar Blvd",  true, User.SubscriptionType.NON_SUB);
        User user6 = new User(6, "fiona", "passFiona", "fiona@example.com", "987 Pine Way",  true, User.SubscriptionType.SUB);
        User user7 = new User(7, "george", "passGeorge", "george@example.com", "159 Elm Court",  true, User.SubscriptionType.NON_SUB);
        User user8 = new User(8, "hannah", "passHannah", "hannah@example.com", "753 Willow Trail",  true, User.SubscriptionType.SUB);
        User user9 = new User(9, "ian", "passIan", "ian@example.com", "852 Spruce Drive",  true, User.SubscriptionType.NON_SUB);
        User user10 = new User(10, "julia", "passJulia", "julia@example.com", "963 Redwood Terrace", true, User.SubscriptionType.SUB);

        Library library1 = new Library(1,"Esan library","Esan",null,5,15);
        Library library2 = new Library(2,"Lanna library","Lanna",null,5,15);
        Library library3 = new Library(3,"Central library","Central",null,5,15);

        user1.addswapbook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "A novel set in the Roaring Twenties.", "great_gatsby.jpg", "New");
        user1.addswapbook("To Kill a Mockingbird", "Harper Lee", "Fiction", "A story about racial injustice in the Deep South.", "to_kill_a_mockingbird.jpg", "Used");
        user1.addswapbook("1984", "George Orwell", "Dystopian", "A novel about a totalitarian regime.", "1984.jpg", "New");
        user1.addswapbook("Pride and Prejudice", "Jane Austen", "Romance", "A classic novel about love and society.", "pride_and_prejudice.jpg", "Used");
        user1.addswapbook("The Catcher in the Rye", "J.D. Salinger", "Fiction", "A story about teenage alienation.", "catcher_in_the_rye.jpg", "New");

        user2.addswapbook("Moby Dick", "Herman Melville", "Adventure", "The quest for the great white whale.", "moby_dick.jpg", "Used");
        user2.addswapbook("War and Peace", "Leo Tolstoy", "Historical", "A novel about the French invasion of Russia.", "war_and_peace.jpg", "New");
        user2.addswapbook("The Odyssey", "Homer", "Epic", "An ancient Greek epic poem.", "the_odyssey.jpg", "Used");
        user2.addswapbook("The Picture of Dorian Gray", "Oscar Wilde", "Philosophical", "A story about vanity and moral duplicity.", "dorian_gray.jpg", "New");
        user2.addswapbook("Brave New World", "Aldous Huxley", "Dystopian", "A novel about a technologically advanced future.", "brave_new_world.jpg", "Used");

        user3.addswapbook("The Hobbit", "J.R.R. Tolkien", "Fantasy", "A fantasy novel about a hobbit's adventure.", "the_hobbit.jpg", "New");
        user3.addswapbook("Fahrenheit 451", "Ray Bradbury", "Dystopian", "A story about a future where books are banned.", "fahrenheit_451.jpg", "Used");
        user3.addswapbook("The Chronicles of Narnia", "C.S. Lewis", "Fantasy", "A series of seven fantasy novels.", "narnia.jpg", "New");
        user3.addswapbook("Jane Eyre", "Charlotte Brontë", "Romance", "A novel about a woman's quest for independence.", "jane_eyre.jpg", "Used");
        user3.addswapbook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "An epic high-fantasy novel.", "lotr.jpg", "New");

        user4.addswapbook("The Alchemist", "Paulo Coelho", "Adventure", "A novel about following your dreams.", "the_alchemist.jpg", "Used");
        user4.addswapbook("The Kite Runner", "Khaled Hosseini", "Historical", "A story about friendship and redemption.", "kite_runner.jpg", "New");
        user4.addswapbook("The Fault in Our Stars", "John Green", "Romance", "A novel about young love and illness.", "fault_in_our_stars.jpg", "Used");
        user4.addswapbook("The Road", "Cormac McCarthy", "Dystopian", "A post-apocalyptic novel.", "the_road.jpg", "New");
        user4.addswapbook("The Book Thief", "Markus Zusak", "Historical", "A story narrated by Death during WWII.", "book_thief.jpg", "Used");

        user5.addswapbook("The Great Alone", "Kristin Hannah", "Historical", "A story of survival in the Alaskan wilderness.", "great_alone.jpg", "New");
        user5.addswapbook("Circe", "Madeline Miller", "Fantasy", "A retelling of the story of Circe from Greek mythology.", "circe.jpg", "Used");
        user5.addswapbook("Where the Crawdads Sing", "Delia Owens", "Mystery", "A coming-of-age story set in the marshes of North Carolina.", "where_the_crawdads_sing.jpg", "New");
        user5.addswapbook("Little Fires Everywhere", "Celeste Ng", "Fiction", "A story about family dynamics and secrets.", "little_fires_everywhere.jpg", "Used");
        user5.addswapbook("The Silent Patient", "Alex Michaelides", "Thriller", "A psychological thriller about a woman's act of violence.", "silent_patient.jpg", "New");

        user6.addswapbook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "A novel set in the Roaring Twenties.", "great_gatsby.jpg", "New");
        user6.addswapbook("To Kill a Mockingbird", "Harper Lee", "Fiction", "A story about racial injustice in the Deep South.", "to_kill_a_mockingbird.jpg", "Used");
        user6.addswapbook("1984", "George Orwell", "Dystopian", "A novel about a totalitarian regime.", "1984.jpg", "New");
        user6.addswapbook("Pride and Prejudice", "Jane Austen", "Romance", "A classic novel about love and society.", "pride_and_prejudice.jpg", "Used");
        user6.addswapbook("The Catcher in the Rye", "J.D. Salinger", "Fiction", "A story about teenage alienation.", "catcher_in_the_rye.jpg", "New");



        System.out.println("Created users:");
        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());
        System.out.println(user4.getName());
        System.out.println(user5.getName());
        System.out.println(user6.getName());
        System.out.println(user7.getName());
        System.out.println(user8.getName());
        System.out.println(user9.getName());
        System.out.println(user10.getName());

        TemplateManager.printAllTemplates();

        user2.swipeRight("1984","George Orwell");
        user2.getBookCandidates();
        user6.swipeRight("Moby Dick", "Herman Melville");
        user6.getBookCandidates();



    }
}