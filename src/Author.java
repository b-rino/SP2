
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        //calling setName method to also have the same conditions when setting name when calling the constructor
        setName(name);
    }

    //Method for adding an object of type Title to the private instance variable titles
    public void addTitle(Title title) {

        titles.add(title);
    }

    //Looping through the ArrayList titles (which consists of objects of type Title) calling the calculateRoyalty method in each iteration to get the final sum (total)
    public float calculateTotalPay(){
        float total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return total;
    }

    //Simple print method to make our main class (LibraryRoyaltyCalculator) look even more simple
    public void printInfo(){
        System.out.println(name + ": " + calculateTotalPay()+ " kr.");
    }

    //Making conditions for setting name and making it throwing an exception if the conditions aren't met
    public void setName(String name) {
            if(name.length() <= 0 || name == null)
                throw new IllegalArgumentException("Name cannot be empty");
            else this.name = name;
    }
}
