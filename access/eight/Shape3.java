package eight;

import eight.shape.RandomShapeGenerator;
import eight.shape.Rectangle;
import eight.shape.Shape;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

/**
 * Created by acer on 14-8-26.
 */
public class Shape3 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape s[] = new Shape[10];
        Shape shape = new Rectangle();
        shape.amend();
        shape.draw();
        println("");

        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s) {
            shp.draw();
            shp.amend();
           // println("");
        }
    }
}
