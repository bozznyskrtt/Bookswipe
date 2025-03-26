public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        User user1 = new User(1, "alice", "passAlice", "alice@example.com", "123 Wonderland Ave", false, true, User.SubscriptionType.SUB);
        User user2 = new User(2, "bob", "passBob", "bob@example.com", "456 Maple Street", false, true, User.SubscriptionType.NON_SUB);
        User user3 = new User(3, "charlie", "passCharlie", "charlie@example.com", "789 Oak Road", true, false, User.SubscriptionType.SUB);
        User user4 = new User(4, "diana", "passDiana", "diana@example.com", "321 Birch Lane", false, true, User.SubscriptionType.SUB);
        User user5 = new User(5, "edward", "passEdward", "edward@example.com", "654 Cedar Blvd", true, true, User.SubscriptionType.NON_SUB);
        User user6 = new User(6, "fiona", "passFiona", "fiona@example.com", "987 Pine Way", false, false, User.SubscriptionType.SUB);
        User user7 = new User(7, "george", "passGeorge", "george@example.com", "159 Elm Court", false, true, User.SubscriptionType.NON_SUB);
        User user8 = new User(8, "hannah", "passHannah", "hannah@example.com", "753 Willow Trail", true, true, User.SubscriptionType.SUB);
        User user9 = new User(9, "ian", "passIan", "ian@example.com", "852 Spruce Drive", false, false, User.SubscriptionType.NON_SUB);
        User user10 = new User(10, "julia", "passJulia", "julia@example.com", "963 Redwood Terrace", true, true, User.SubscriptionType.SUB);

        Book book1 = new Book(1,"The Great Gatsby", "F. Scott Fitzgerald", user1,"Fiction", "A novel set in the Roaring Twenties.", "great_gatsby.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book2 = new Book(2,"To Kill a Mockingbird", "Harper Lee", user1,"Fiction", "A story about racial injustice in the Deep South.", "to_kill_a_mockingbird.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book3 = new Book(3,"1984", "George Orwell",user1, "Dystopian", "A novel about a totalitarian regime.", "1984.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book4 = new Book(4,"Pride and Prejudice", "Jane Austen",user1, "Romance", "A classic novel about love and society.", "pride_and_prejudice.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book5 = new Book(5,"The Catcher in the Rye", "J.D. Salinger", user1,"Fiction", "A story about teenage alienation.", "catcher_in_the_rye.jpg", "New", true,"swap",Book.Status.AVAILABLE);

        Book book6 = new Book(6,"Moby Dick", "Herman Melville", user2,"Adventure", "The quest for the great white whale.", "moby_dick.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book7 = new Book(7,"War and Peace", "Leo Tolstoy", user2,"Historical", "A novel about the French invasion of Russia.", "war_and_peace.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book8 = new Book(8,"The Odyssey", "Homer", user2,"Epic", "An ancient Greek epic poem.", "the_odyssey.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book9 = new Book(9,"The Picture of Dorian Gray", "Oscar Wilde", user2,"Philosophical", "A story about vanity and moral duplicity.", "dorian_gray.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book10 = new Book(10,"Brave New World", "Aldous Huxley", user2,"Dystopian", "A novel about a technologically advanced future.", "brave_new_world.jpg", "Used", true, "swap",Book.Status.AVAILABLE);

        Book book11 = new Book(11,"The Hobbit", "J.R.R. Tolkien", user3,"Fantasy", "A fantasy novel about a hobbit's adventure.", "the_hobbit.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book12 = new Book(12,"Fahrenheit 451", "Ray Bradbury", user3,"Dystopian", "A story about a future where books are banned.", "fahrenheit_451.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book13 = new Book(13,"The Chronicles of Narnia", "C.S. Lewis", user3,"Fantasy", "A series of seven fantasy novels.", "narnia.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book14 = new Book(14,"Jane Eyre", "Charlotte Brontë", user3,"Romance", "A novel about a woman's quest for independence.", "jane_eyre.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book15 = new Book(15,"The Lord of the Rings", "J.R.R. Tolkien", user3,"Fantasy", "An epic high-fantasy novel.", "lotr.jpg", "New", true, "swap",Book.Status.AVAILABLE);

        Book book16 = new Book(16,"The Alchemist", "Paulo Coelho", user4,"Adventure", "A novel about following your dreams.", "the_alchemist.jpg", "Used", true,"swap",Book.Status.AVAILABLE);
        Book book17 = new Book(17,"The Kite Runner", "Khaled Hosseini", user4,"Historical", "A story about friendship and redemption.", "kite_runner.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book18 = new Book(18,"The Fault in Our Stars", "John Green", user4,"Romance", "A novel about young love and illness.", "fault_in_our_stars.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book19 = new Book(19,"The Road", "Cormac McCarthy", user4,"Dystopian", "A post-apocalyptic novel.", "the_road.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book20 = new Book(20,"The Book Thief", "Markus Zusak", user4,"Historical", "A story narrated by Death during WWII.", "book_thief.jpg", "Used", true, "swap",Book.Status.AVAILABLE);

        Book book21 = new Book(21,"The Great Alone", "Kristin Hannah", user5,"Historical", "A story of survival in the Alaskan wilderness.", "great_alone.jpg", "New", true,"swap",Book.Status.AVAILABLE);
        Book book22 = new Book(22,"Circe", "Madeline Miller", user5,"Fantasy", "A retelling of the story of Circe from Greek mythology.", "circe.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book23 = new Book(23,"Where the Crawdads Sing", "Delia Owens", user5,"Mystery", "A coming-of-age story set in the marshes of North Carolina.", "where_the_crawdads_sing.jpg", "New", true,"swap",Book.Status.AVAILABLE);
        Book book24 = new Book(24,"Little Fires Everywhere", "Celeste Ng", user5,"Fiction", "A story about family dynamics and secrets.", "little_fires_everywhere.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book25 = new Book(25,"The Silent Patient", "Alex Michaelides", user5,"Thriller", "A psychological thriller about a woman's act of violence.", "silent_patient.jpg", "New", true, "swap",Book.Status.AVAILABLE);

        Book book26 = new Book(26,"The Night Circus", "Erin Morgenstern", user6,"Fantasy", "A magical competition between two young illusionists.", "night_circus.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book27 = new Book(27,"Anxious People", "Fredrik Backman",  user6,"Fiction", "A poignant story about a bank robbery gone wrong.", "anxious_people.jpg", "New", true,"swap",Book.Status.AVAILABLE);
        Book book28 = new Book(28,"The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", user6, "Historical", "A reclusive Hollywood icon recounts her life story.", "seven_husbands.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book29 = new Book(29,"The Invisible Life of Addie LaRue", "V.E. Schwab", user6, "Fantasy", "A woman makes a Faustian bargain to live forever.", "invisible_life.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book30 = new Book(30,"The Vanishing Half", "Brit Bennett",  user6,"Fiction", "A multigenerational story about identity and race.", "vanishing_half.jpg", "Used", true, "swap",Book.Status.AVAILABLE);

        Book book31 = new Book(31,"A Man Called Ove", "Fredrik Backman", user7, "Fiction", "A heartwarming story about a curmudgeonly man.", "man_called_ove.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book32 = new Book(32,"The House in the Cerulean Sea", "TJ Klune",  user7,"Fantasy", "A whimsical story about a magical orphanage.", "house_cerulean_sea.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book33 = new Book(33,"The Midnight Library", "Matt Haig",  user7,"Fantasy", "A novel about choices and regrets.", "midnight_library.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book34 = new Book(34,"The Guest List", "Lucy Foley",  user7,"Thriller", "A wedding celebration turns deadly.", "guest_list.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book35 = new Book(35,"The Henna Artist", "Alka Joshi",  user7,"Historical", "A story about a woman in 1950s India.", "henna_artist.jpg", "New", true, "swap",Book.Status.AVAILABLE);

        Book book36 = new Book(36,"The Light We Lost", "Jill Santopolo",  user8,"Romance", "A love story about choices and fate.", "light_we_lost.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book37 = new Book(37,"The Paper Palace", "Miranda Cowley Heller",  user8,"Fiction", "A story about love and regret over a summer.", "paper_palace.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book38 = new Book(38,"Malibu Rising", "Taylor Jenkins Reid",  user8,"Fiction", "A story about a family reunion and secrets.", "malibu_rising.jpg", "Used", true,"swap",Book.Status.AVAILABLE);
        Book book39 = new Book(39,"The Song of Achilles", "Madeline Miller", user8, "Historical", "A retelling of the Iliad from Patroclus's perspective.", "song_of_achilles.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book40 = new Book(40,"The Overstory", "Richard Powers", user8, "Fiction", "A complex narrative about trees and humanity.", "overstory.jpg", "Used", true, "swap",Book.Status.AVAILABLE);

        Book book41 = new Book(41,"Before the Coffee Gets Cold", "Toshikazu Kawaguchi",  user9,"Fiction", "A story about time travel and love.", "before_coffee.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book42 = new Book(42,"The Tattooist of Auschwitz", "Heather Morris",  user9,"Historical", "A story of love and survival during the Holocaust.", "tattooist.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book43 = new Book(43,"The Nightingale", "Kristin Hannah",  user9,"Historical", "A story of two sisters in WWII France.", "nightingale.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book44 = new Book(44,"Educated", "Tara Westover",  user9,"Memoir", "A memoir about a woman's quest for knowledge.", "educated.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book45 = new Book(45,"Becoming", "Michelle Obama",  user9,"Memoir", "A memoir by the former First Lady of the United States.", "becoming.jpg", "New", true, "swap",Book.Status.AVAILABLE);

        Book book46 = new Book(46,"The Silent Patient", "Alex Michaelides",  user10,"Thriller", "A psychological thriller about a woman's act of violence.", "silent_patient.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book47 = new Book(47,"The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", user10,"Historical", "A reclusive Hollywood icon recounts her life story.", "seven_husbands.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book48 = new Book(48,"The Guest List", "Lucy Foley", user10,"Thriller", "A wedding celebration turns deadly.", "guest_list.jpg", "Used", true, "swap",Book.Status.AVAILABLE);
        Book book49 = new Book(49,"The Midnight Library", "Matt Haig", user10,"Fantasy", "A novel about choices and regrets.", "midnight_library.jpg", "New", true, "swap",Book.Status.AVAILABLE);
        Book book50 = new Book(50,"The Invisible Life of Addie LaRue", "V.E. Schwab", user10,"Fantasy", "A woman makes a Faustian bargain to live forever.", "invisible_life.jpg", "Used", true, "swap",Book.Status.AVAILABLE);

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

        book1.getName();
    }
}