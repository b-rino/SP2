import java.awt.print.Book;

//using the extends keyword to specify that this is a sub-class to super-class Title
public class AudioBook extends Title{

    private int durationInMinutes;

    //Constructor which shares three parameters with it's super-class (Title), which is why we can call super()
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }
    //Method to calculate the final amount of points the audio book achieved
    protected double calculatePoints(){
        return (durationInMinutes /2) * calculateLiteraturePoints() * copies;
    }

    //Setting the correct amount of point pr. minute using .equals method because we work with objects (Strings) and not primitive variables (== won't work)
    protected double calculateLiteraturePoints(){
        double result = 0;
        if (literatureType.equals("BI") || literatureType.equals("TE")) {
            result = 1.5;
        } else if (literatureType.equals("LYRIK")) {
            result = 3;
        } else if (literatureType.equals("SKØN")) {
            result = 0.85;
        } else if (literatureType.equals("FAG")) {
            result = 0.5;
        }
        else{
            System.out.println("Please enter a valid literature type");
        }

        return result;
    }
}
