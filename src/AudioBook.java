public class AudioBook {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;

    }

    protected double calculatePoints(){
        return 0; //just to compile for a start
    }

    protected double calculateLiteraturePoints(){
        return 0; //just to compile for a start
    }
}
