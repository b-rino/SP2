public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //Initializing an instance of class Author
        Author author = new Author("Olivia R.");

        //Initializing an instance of class AudioBook and two instances of class PrintedBook
        AudioBook book1 = new AudioBook("The Deadly Vow - Audio Edition", "SKØN", 1500, 244);
        PrintedBook book2 = new PrintedBook("Java 1.0", "FAG", 250, 320);
        PrintedBook book3 = new PrintedBook("Barnyard Animals", "BI", 9300, 8);


        //Adding the three books to the ArrayList we have in class Author, which holds "Title" objects. Both AudioBook and PrintedBook fit in the ArrayList because they are sub-classes to Title
        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(book3);

        //Printing out the modified toString method
        System.out.println(author);


    }

}
