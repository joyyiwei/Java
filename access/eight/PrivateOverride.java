package eight;

/**
 * Created by acer on 14-8-26.
 */

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }
    public static void main(String[] args) {
        PrivateOverride po = new PrivateOverride();
        po.f();
    }
}
