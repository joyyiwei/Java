package eight;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by acer on 14-8-30.
 */

class RandomRodentGenerator {
    private Shared shared = new Shared();
    private Random rand = new Random();
    public Rodant next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}

class Rodant {
    private int refcount = 0;
    private static long count = 0;
    private final long id = count++;
    private String name = "Rodant";
    protected void eat() { print("Rodant.eat()"); }
    protected void run() { print("Rodant.run"); }
    protected void sleep() { print("Rodant.sleep"); }
    public String toString() { return name; }
    public void addRef() { refcount++; }
}

class Mouse extends Rodant {
    private String name = "Mouse";
    private Characteristic ch = new Characteristic("Rodant");
    private Description de = new Description("Rodant");
    protected void eat() { print("Mouse.eat()"); }
    protected void run() { print("Mouse.run()");}
    protected void sleep() { print("Mouse.sleep()");}
    public String toString() { return name; }
}

class Rat extends Rodant {
    private String name = "Rat";
    private Characteristic ch = new Characteristic("Rat");
    private Description de = new Description("Rat");
    protected void eat() { print("Rat.eat()"); }
    protected void run() { print("Rat.run()"); }
    protected void sleep() { print("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel extends Rodant {
    private String name = "Squirrel";
    private Characteristic ch = new Characteristic("Squirrel");
    private Description de = new Description("Squirrel");
    protected void eat() { print("Squirrel.eat()"); }
    protected void run() { print("Squirrel.run()"); }
    protected void sleep() { print("Squirrel.sleep()"); }
    public String toString() { return name; }
}

public class Rodent9 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String args[]) {
        Rodant ans[] = new Rodant[5];
        for (Rodant i : ans) {
            i = gen.next();
            System.out.println(i + ":");
            i.eat();
            i.run();
            i.sleep();
            System.out.println("");
        }
    }

}
