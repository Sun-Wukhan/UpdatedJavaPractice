import java.awt.*;

public class PolymorphismShapes {
    void draw(){
        System.out.println("This will let me draw something");
    }

    static class Shape extends PolymorphismShapes{
        void draw(){
            System.out.println("This will let me draw a shape");
        }
    }

    static class Square extends PolymorphismShapes{
        void draw(){
            System.out.println("This will let me draw a square");
        }
    }

    static class Circle extends PolymorphismShapes{
        void draw(){
            System.out.println("This will let me draw a circle");
        }
    }

    static class Rectangle extends PolymorphismShapes{
        void draw(){
            System.out.println("This will let me draw a rectangle");
        }
    }

    public static void main(String[]args){

        PolymorphismShapes p1 = new PolymorphismShapes();
        p1.draw();

        p1 = new Rectangle();
        p1.draw();

        p1 = new Square();
        p1.draw();




    }


}
