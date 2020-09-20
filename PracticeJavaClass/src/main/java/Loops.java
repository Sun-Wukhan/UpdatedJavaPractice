import java.util.Arrays;

public class Loops {

    public static void main(String[]args){
        int[] seriesOfNumbers = {1, 2, 4, 5, 6, 7, 8, 9};

        System.out.println(seriesOfNumbers); //This will not print the array; it prints location in memory
        System.out.println(seriesOfNumbers[3]); //this will print out 5
        System.out.println(Arrays.toString(seriesOfNumbers)); //this converts the arrays to string

        for(int i : seriesOfNumbers ) {
            System.out.println(i);
        }

        for(int i=0; i<=10; i++) {
            System.out.print(i);
        }
    }
}
