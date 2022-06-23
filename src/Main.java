import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        fruits.add(0, "Mango");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        fruits.set(3,"Orange");
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
        System.out.println(fruits.size());

        for(int i = 0; i < fruits.size(); i++)
            System.out.println(fruits.get(i) + " ");
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
