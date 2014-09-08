package seven;

/**
 * Created by acer on 14-8-14.
 */
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A{
    B() {
        System.out.println("B");
    }
}

public class C extends A{
    B b = new B();
    public static void main(String[] args) {
        C c = new C(); //will be construct an A first
        // A will be construct twice

    }
}
/* output
A
A
B
 */