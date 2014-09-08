package seven;

/**
 * Created by acer on 14-8-13.
 */

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
public class DetergentDelegation extends Cleanser{
    public void scrub() {
        append("DetergentDelegation.scrub");
        super.scrub();
    }
    public void sterilize() {
        System.out.println("this is a new method");
    }
    public static void main(String[] args) {
        DetergentDelegation tmp = new DetergentDelegation();
        tmp.dilute();
        tmp.apply();
        tmp.scrub();
        tmp.sterilize();
        System.out.println(tmp);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
