package eight.shape;

/**
 * Created by acer on 14-8-26.
 */
import java.util.*;

public class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
} ///:~
