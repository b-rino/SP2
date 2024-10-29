//abstract class because we won't need to make instances of this class, but instead have some common fields and methods for the sub-classes to use

public abstract class Title {

    //Declaring the fields (and initializing "rate" because it's a permanent number
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //This calculation uses the permanent number "rate" and the  points (calculated in different ways) from the subclasses
    public double calculateRoyalty(){

        return calculatePoints() * rate;
    }

    //Abstract methods which means we demand our sub-classes to make a method with the same signature

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();


    //Making a getter for the private instance variable to gain access to its value which is used in the sub-classes
    public String getLiteratureType() {
        return literatureType;
    }

}
