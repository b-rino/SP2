//using the extends keyword to specify that this is a sub-class to super-class Title
public class PrintedBook extends Title{

    private int pages;

    //Constructor which shares three parameters with it's super-class (Title), which is why we can call super()
    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //Method to calculate the final amount of points the printed book achieved
    protected double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;

    }

    //Setting the correct amount of point pr. page using .equals method because we work with objects (Strings) and not primitive variables (== won't work)
    protected double calculateLiteraturePoints() {
        double result = 0;
        if (literatureType.equals("BI") || literatureType.equals("TE")) {
            result = 3;
        } else if (literatureType.equals("LYRIK")) {
            result = 6;
        } else if (literatureType.equals("SKØN")) {
            result = 1.7;
        } else if (literatureType.equals("FAG")) {
            result = 1;
        } else System.out.println("Please enter a valid literature type");
        return result;
    }
}
