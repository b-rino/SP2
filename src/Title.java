
//Making class abstract because we won't need to make instances of this class, but instead have some common fields and methods for the sub-classes to use
public abstract class Title {

    //Declaring the fields (and initializing "rate" because it's a permanent number)
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;


    //Using the setters to incorporate conditions in constructor
    public Title(String title, String literatureType, int copies) {
        setTitle(title);
        setLiteratureType(literatureType);
        setCopies(copies);
    }

    //This calculation uses the permanent number from variable "rate" and the calculatePoints (calculated in different ways) from the subclasses
    public double calculateRoyalty(){

        return calculatePoints() * rate;
    }

    //Abstract methods which means we demand our sub-classes to make a method with the same signature

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();


    //Setters for the instance variables with appropriate conditions. Exception will be thrown if conditions aren't met.
    public void setLiteratureType(String literatureType) {
        if(literatureType.isEmpty()) {
            throw new IllegalArgumentException("Literature type cannot be empty");
        }else {
            this.literatureType = literatureType;
        }
    }


    public void setTitle(String title) {
        if(title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }else {
            this.title = title;
        }
    }


    public void setCopies(int copies) {
        if(copies < 0) {
            throw new IllegalArgumentException("Copies cannot be negative");
        }else {
            this.copies = copies;
        }
    }


    //Getters for the instance variables. Only "getLiteratureType" is used in this assignment though.
    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public String getLiteratureType() {

        return literatureType;
    }

}
