package eight;

/**
 * Created by acer on 14-9-8.
 */
public class Rodent12 {
    private static RandomRodentGenerator tmp = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodant rodant[] = new Rodant[3];
        for (Rodant r : rodant) {
            r = tmp.next();
            System.out.println(r);
            System.out.println("");
        }
    }
}
