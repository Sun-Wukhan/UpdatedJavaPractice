import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListPractice {

    public static void main(String[] arg) {

        String cars[] = {"Lexus", "BMW", "Toyota", "Mercedes", "Honda"};

//        for(String brands : cars) {
//            System.out.println(brands);
//        }
//
//        for(int i = 0; i<cars.length; i++) {
//            System.out.println(cars[i]);
//        }

        ArrayList<String> ar = new ArrayList<>(); //Got to define if its string etc
        ar.add("Lamborghini");
        ar.add("Ferrari");
        ar.add("Porsche");

        //System.out.println(Arrays.toString(cars));

        for (String vehicles : ar) {
            System.out.println(vehicles);
        }
    }
}
