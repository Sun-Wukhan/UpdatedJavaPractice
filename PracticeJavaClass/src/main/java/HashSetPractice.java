import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        String code = "aaaabbbbcdefghijj";


        Set<Character> unique = new HashSet<>();

        char[] c = code.toCharArray();

        for (char practice : c) {
            if (unique.add(practice) == false) {
                System.out.println(practice);
            }
        }

        // System.out.println(unique);
    }
}

