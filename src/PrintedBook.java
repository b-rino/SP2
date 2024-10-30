//using the extends keyword to specify that this is a sub-class to super-class Title
public class PrintedBook extends Title{

    private int pages;

    //Constructor which shares three parameters with it's super-class (Title), which is why we can call super()
    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    //Method to calculate the final amount of points the printed book will achieve
    protected double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;

    }

    @Override
    //Setting the amount of points pr. page using a switch, which will also throw an exception if none of the valid literature types are present
    protected double calculateLiteraturePoints() {
        double result;
        switch (getLiteratureType()) {
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
