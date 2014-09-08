package eight;

/**
 * Created by acer on 14-9-8.
 */
import static net.mindview.util.Print.print;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void finalize() {
        if (refcount > 0)
            print("Error: " + refcount + " shared " + id + " objects in use");
    }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}

public class ReferenceCounting13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for(Composing c : composing)
            c.dispose();

        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        shared.finalize();

        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        sharedTest.finalize();
    }
}

