import java.util.ArrayList;

public class Cat {
    private String name;
    private String address;
    private ArrayList<String> fleas;

    public Cat(String name, String address, ArrayList<String> fleas) {
        this.name = name;
        this.address = address;
        this.fleas = fleas;
    }

    // static array to hold all the instances of the class
    static public ArrayList<Cat> allTheCats = new ArrayList<Cat>();

    static void gatherOnKitchenToEat() {
        System.out.println("Pssst! pssst! psst!");
        for (Cat specificCat:
             allTheCats) {

            System.out.println("Meow meow! i am going to the kitchen: " + specificCat.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getFleas() {
        return fleas;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFleas(ArrayList<String> fleas) {
        this.fleas = fleas;
    }
}
