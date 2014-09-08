package eight;

/**
 * Created by acer on 14-9-8.
 */
class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()");}
}

class Chess {
    Chess() { System.out.println("Chess()"); }
}

class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}

public class Sandwich11 {
    private Bread b = new Bread();
    private Chess c = new Chess();
    private Pickle p = new Pickle();
    Sandwich11() { System.out.println("Sandwich11()"); }
    public static void main(String[] args) {
        new Sandwich11();
    }
}
