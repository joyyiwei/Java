package eight;

/**
 * Created by acer on 14-8-26.
 */
public class Biking5 {
    public static void ride(Cycle c) {
        c.travel(c);
        System.out.println("wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u); // upcast to Cycle
        ride(b); //域并没有改变
        ride(t);
    }
}
