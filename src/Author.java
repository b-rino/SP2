import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    //Using setter method to incorporate conditions in constructor
    public Author(String name) {
        setName(name);
    }

    //Method for adding an object to our ArrayList "titles"
    public void addTitle(Title title) {
        titles.add(title);
    }

    //Looping through the ArrayList "titles" (which consists of objects of type Title) calling the calculateRoyalty method in each iteration to get the final sum ("total")
    //Usage of BigDecimal and RoundingMode is to ensure we only get two decimals in the result. Usually I would prefer DecimalFormat, but I couldn't make it work this time
    public float calculateTotalPay(){
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        BigDecimal bd = new BigDecimal(total);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }


    //Making conditions for setting name and making it throwing an exception if the conditions aren't met
    public void setName(String name) {
            if(name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }else{
                this.name = name;
            }
    }

    public String getName() {
        return name;
    }

    //Modifying the toString method to get a simple print when called
    @Override
    public String toString() {
        return name + ": " + calculateTotalPay();
    }
}
