import java.awt.print.Book;

//using the extends keyword to specify that this is a sub-class to super-class Title
public class AudioBook extends Title{

    private int durationInMinutes;

    //Constructor which shares three parameters with it's super-class (Title), which is why we can call super()
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }
    //Method to calculate the final amount of points the audio book will achieve
    protected double calculatePoints(){

        return (durationInMinutes /2) * calculateLiteraturePoints() * copies;
    }

    //Setting the correct amount of point pr. minute using .equals method because we work with objects (Strings) and not primitive variables (== won't work)
    protected double calculateLiteraturePoints(){
        double result;
        switch(literatureType) {
            case "BI":
            case "TE":
                result = 1.5;
                break;
            case "LYRIK":
                result = 3;
                break;
            case "SKØN":
                result = 0.85;
                break;
            case "FAG":
                result = 0.5;
                break;
            default:
                throw new IllegalArgumentException("Please enter a valid literature type: BI, TE, LYRIK, SKØN or FAG");
        }
        return result;
    }
}
