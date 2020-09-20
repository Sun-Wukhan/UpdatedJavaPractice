public class EqualsToAndFromPractice {

    public static void main(String[] args) {

        String str = "This is a new1 sentence";
        String str2 = "This is a new sentence";

        int x = 10;
        int y = 20;


        if(str.equalsIgnoreCase(str2)) {
            System.out.println("They match");
        } else {
            System.out.println("They do not match");
        }

        if(x*2 == y) {
            System.out.println("These match");
        } else {
            System.out.println("They do not match either");
        }



    }
}



