import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListPractice {

    public static void main(String[] args) {
        LinkedList<String> p1 = new LinkedList<String>();
        int i;

        p1.add("chocolate");
        p1.add("Flour");
        p1.add("cookies");

//        ArrayList<String> p2 = new ArrayList<String>();
//        p2.add("Lexus");
//        p2.add("BMW");
//        p2.add("Toyota");
//        p2.add("Honda");

         for(i = 0; i<=10; i++) {

            System.out.println(p1); //No matter how many times you print this, it will always be in this order. whereas Arraylist isnt
        }
    }

}
