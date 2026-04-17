package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Book[] books = new Book[20];

        books[0]  = new Book(1,  "978-0743273565", "The Great Gatsby",                    null, false);
        books[1]  = new Book(2,  "978-0061096525", "To Kill a Mockingbird",               null, false);
        books[2]  = new Book(3,  "978-0451524935", "1984",                                null, false);
        books[3]  = new Book(4,  "978-0743273560", "One Hundred Years of Solitude",       null, false);
        books[4]  = new Book(5,  "978-0618640157", "The Lord of the Rings",               null, false);
        books[5]  = new Book(6,  "978-0385333481", "The Handmaid's Tale",                 null, false);
        books[6]  = new Book(7,  "978-0374528379", "Crime and Punishment",                null, false);
        books[7]  = new Book(8,  "978-0316769174", "The Catcher in the Rye",              null, false);
        books[8]  = new Book(9,  "978-0679720201", "In Search of Lost Time",              null, false);
        books[9]  = new Book(10, "978-0062315007", "The Alchemist",                       null, false);
        books[10] = new Book(11, "978-0374528386", "Anna Karenina",                       null, false);
        books[11] = new Book(12, "978-0486280615", "Pride and Prejudice",                 null, false);
        books[12] = new Book(13, "978-0743482747", "Moby-Dick",                           null, false);
        books[13] = new Book(14, "978-0375831010", "The Road",                            null, false);
        books[14] = new Book(15, "978-0525559474", "The Hitchhiker's Guide to the Galaxy",null, false);
        books[15] = new Book(16, "978-0062409850", "Brave New World",                     null, false);
        books[16] = new Book(17, "978-0140449136", "Don Quixote",                         null, false);
        books[17] = new Book(18, "978-0374105235", "Beloved",                             null, false);
        books[18] = new Book(19, "978-0385490818", "The Brothers Karamazov",              null, false);
        books[19] = new Book(20, "978-0316346627", "Dune",                                null, false);

    }
}
