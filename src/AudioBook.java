//Using the "extends" keyword to specify that this is a sub-class to super-class Title
public class AudioBook extends Title{

    private int durationInMinutes;

    //Constructor which shares three parameters with it's super-class (Title)
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        setDurationInMinutes(durationInMinutes);

    }

    @Override
    //Method to calculate the final amount of points the audio book will achieve
    protected double calculatePoints(){

        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
    }

    @Override
    //Setting the amount of points pr. minute using a switch, which will also throw an exception if none of the valid literature types are present
    protected double calculateLiteraturePoints(){
        double result;
        switch(getLiteratureType()) {
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

    //Setter and getter for private instance variable
    public void setDurationInMinutes(int durationInMinutes) {
        if(durationInMinutes < 0)
            throw new IllegalArgumentException("Duration must be a positive integer");
        else
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
