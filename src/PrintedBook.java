//using the extends keyword to specify that this is a sub-class to super-class Title
public class PrintedBook extends Title{

    private int pages;

    //Constructor which shares three parameters with it's super-class (Title), which is why we can call super()
    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //Method to calculate the final amount of points the printed book will achieve
    protected double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;

    }

    //Setting the correct amount of point pr. page using .equals method because we work with objects (Strings) and not primitive variables (== won't work)
    protected double calculateLiteraturePoints() {
        double result;
        switch (literatureType) {
            case "BI":
            case "TE":
                result = 3;
                break;
            case "LYRIK":
                result = 6;
                break;
            case "SKØN":
                result = 1.7;
                break;
            case "FAG":
                result = 1;
                break;
            default:
                throw new IllegalArgumentException("Please enter a valid literature type: BI, TE, LYRIK, SKØN or FAG");
        }
        return result;
    }
}
