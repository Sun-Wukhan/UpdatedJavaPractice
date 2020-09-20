public class IfAndElsePractice {

    public static void main(String[] args) {

        studentGrades("Navid", 4);
        studentGrades("Rafeen", 15);
        studentGrades("whoTheFuckeisha", 8);
        studentGrades("Bob", 7);
        studentGrades("MewTwo", 15);

    }

    public static void studentGrades(String student, int grade) {

        if (grade >= 10) {
            System.out.println("Excellent");
        } else if (grade < 10 && grade >= 7) {
            System.out.println("These are alright");
        } else {
            System.out.println("Fail");
        }

        System.out.println(student + grade);
    }

}

