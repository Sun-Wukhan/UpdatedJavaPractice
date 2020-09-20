public class GameBoy {

    public GameBoy() {

        System.out.println("I am a GameBoy Constructor"); //Everytime you make a new object this gets called

    }

    public GameBoy(String model, int version) {
        System.out.println(model + "" + version + " This Gameboy is a parameterized constructor. it's a constructor with arguments");

    }

    public static void main(String[] args) throws CloneNotSupportedException {

        GameBoy p1 = new GameBoy(); //this is how you create a new object. It invokes the constructor
        p1.gamePlay();
        //this is how you call public void gamePlay method; using the object (p1) and .(method name here)
        //You can call the method anything you want. I opt in for p1/p2/IS/C300/ car names basically.
        p1.gamePlay("Pokemon Black", 2);
        p1.settings();
        messages("word"); // static methods get called without needing an object (p1)

        GameBoy p2 = new GameBoy("DS", 2); //this does the exact same thing as the other constructor, its just got parameters


    }

    public void gamePlay() {
        System.out.println("This method lets me play games");
        //These are methods that can be implemented and called on by the object.
        //If you print this without calling on it, (p1.gamePlay), it will compile correctly but
        //print the statement "This Method lets me play games" out
    }

    public void gamePlay(String game, int version) {
        System.out.println("This will let me play " + game + " " + version + ".");
        //This is method overloading. It's got the same name "gamePlay" as the other method
        //but it has parameters and required a String and int argument to function
    }

    public void settings() {
        System.out.println("This lets me access the settings");
    }

    public static void messages(String reply) {
        System.out.println(reply + "<--- This is a static method");
    }
}

