public class PrintedBook {

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        this.pages = pages;
    }

    protected double calculatePoints(){
        return 0; //just to compile
    }

    protected double calculateLiteraturePoints(){
        return 0; //just to compile
    }
}
