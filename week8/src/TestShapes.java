import java.awt.*;

public class TestShapes {
    public static void main(String[] args) {

        Shape square = new Shape ("blue");


        Rectangle square = new Rectangle();
        square.describe();

        Rectangle r1 = new Rectangle("blue",3,4) ;
        Rectangle r2 = new Rectangle(3,4);
        System.out.println(r1.equals(r2));
    }
}