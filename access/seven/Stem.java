package seven;

/**
 * Created by acer on 14-8-14.
 */
class Component1 {
    //Component1() {System.out.println("Component1()");}
    Component1(byte i) {System.out.println("Component(byte)");}
    void dispose() {System.out.println("Component1.dispose()");}
}
class Component2 {
    //Component2() {System.out.println("Component2()");}
    Component2(short i) {System.out.println("Component(short)");}
    void dispose() {System.out.println("Component2.dispose()");}
}
class Component3 {
    //Component3() {System.out.println("Component3()");}
    Component3(int i) {System.out.println("Component(int)");}
    void dispose() {System.out.println("Component3.dispose()");}
}
class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root(float i) {
        c1root = new Component1((byte)1);
        c2root = new Component2((short)2);
        c3root = new Component3(3);
        System.out.println("Root(float)");
    }
    void dispose() {
        c3root.dispose();
        c2root.dispose();
        c1root.dispose();
        System.out.println("Root.dispose()");
    }
}
public class Stem extends Root{
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;
    Stem(double i) {
        super(1.1f);
        c1stem = new Component1((byte)4);
        c2stem = new Component2((short)5);
        c3stem = new Component3(6);
        System.out.println("Stem(double)");
    }
    void dispose() {
        c3stem.dispose();
        c2stem.dispose();
        c1stem.dispose();
        System.out.println("Stem.dispos()");
    }
    public static void main(String[] args) {
        Stem tmp = new Stem(3.3);
        try {
            // code
        } finally {
            tmp.dispose();
        }

    }
}
/*output
first version
Component(byte)
Component(short)
Component(int)
Root(float)
Component(byte)
Component(short)
Component(int)
Stem(double)
 */
