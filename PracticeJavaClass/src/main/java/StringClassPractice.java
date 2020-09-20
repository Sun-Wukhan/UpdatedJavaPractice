import java.sql.SQLOutput;

public class StringClassPractice {

    public static void main(String[]args) throws CloneNotSupportedException {

        String str = "Lets go";
        String anotherStr = "New Word";

        System.out.println(str); //prints out "Lets go";

        str.concat("word"); //concat means to join
        System.out.println(str); //Will not work because String is immutable

        StringBuffer sb = new StringBuffer(str); // Stringbuffers argument needs a String reference
        System.out.println(sb.reverse()); // This will reverse the String

        StringBuilder sBuilder = new StringBuilder(str); //faster to use in terms of run time
        System.out.println(sBuilder.append(anotherStr)); // append means to join

        String str1 = "Navid"; // New word in the Heap memory of Java
        String piecesOfStr = str1.substring(0, 3); //takes pieces of old string and makes new one
        System.out.println(piecesOfStr); // expected output should be Nav from (Nav)id

        System.out.println(piecesOfStr + piecesOfStr + piecesOfStr); //manually concat makes NavNavNav

    }
}
