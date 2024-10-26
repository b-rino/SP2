import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<String> titles;

    public Author(String name) {
        setName(name);
    }

    public void addTitle(String title) {
        titles.add(title);
    }

    public float calculateTotalPay(){
        float total = 0;

        return total;
    }

    public String getName() { //getters and setters are used for testing in this assignment
        return name;
    }

    public void setName(String name) {
        if(name.length() > 0)
        this.name = name;
    }
}
