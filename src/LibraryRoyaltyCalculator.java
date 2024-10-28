import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //Creating one instance of class AudioBook and two instances of class PrintedBook
        AudioBook book1 = new AudioBook("The Deadly Vow - Audio Edition", "SKØN", 1500, 244);
        PrintedBook book2 = new PrintedBook("Java 1.0", "FAG", 250, 320);
        PrintedBook book3 = new PrintedBook("Barnyard Animals", "BI", 9300, 8);

        //Creating one instance of class Author
        Author author = new Author("Benjamin");

        //Adding the three books to the instance variable ArrayList in class Author. Both types of books are sub-classes to Title, which is why they will fit in the Title ArrayList
        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(book3);

        //calling method from class Author, which prints out name and total earnings
        author.printInfo();



    }

}

//book1 10511
//book2 5405kr
//book3 15082
//tilsammen 30999