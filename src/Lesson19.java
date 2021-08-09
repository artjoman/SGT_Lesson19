import java.util.ArrayList;

public class Lesson19 {

    public static void main(String[] args) {

        Food myFood = new Food();

        myFood.setWeight(500);

        int foodWeight = myFood.getWeight();


        int worldProduction = Food.seeGlobalProductionRate();

        Cat cat1 = new Cat();
        cat1.setName("Muris");

        Cat cat2 = new Cat();
        cat2.setName("Puris");

        Cat cat3 = new Cat();
        cat3.setName("Barsik");

        Cat.allTheCats.add(cat1);
        Cat.allTheCats.add(cat2);
        Cat.allTheCats.add(cat3);

        Cat.gatherOnKitchenToEat();

        // 2 Examples how to create an instance with ArrayLists
        Cat catWithFleas = new Cat("Boris", "Riga", new ArrayList<>());
        catWithFleas.getFleas().add("harry");
        catWithFleas.getFleas().add("Mary");
        catWithFleas.getFleas().add("Johnny");



        ArrayList<String> fleas = new ArrayList<String>();
        fleas.add("harry");
        fleas.add("Mary");
        // ...
        Cat anotherCatWithFleas = new Cat("Long John", "Island", fleas);


    }

    // SCOPES
    public void methodWithPrivateScope() {
        int variableWithLimitedScope = 10;

        System.out.println(variableWithLimitedScope);
    }

    public void methodToAccessPrivateScope() {
        // THIS WON"T WORK
//        System.out.println(variableWithLimitedScope);
    }
}
