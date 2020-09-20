public class ExceptionHandlingPractice {

    public static void main(String[]args){

        int x, y;
        x = 10;
        y = 0;
    try {
        System.out.println(x/y);
    }

    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception");
    }

    catch (ArithmeticException A) {
        System.out.println("This is a math issue not a you issue");
    }

    finally{
        System.out.println("Finally block did its job");
    }

        }
}
