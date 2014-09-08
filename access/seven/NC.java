package seven;

/**
 * Created by acer on 14-8-14.
 */
class NA {
    NA(int a) {
        System.out.println("this is NA, " + a);
    }
}
class NB extends NA{
    NB(int b) {
        super(1);
        System.out.println("this is NB, " + b);
    }
}
public class NC extends NA{
    private int nc;
    NB nb = new NB(111); // will construct another A and then a B
    NC(int c) {
        super(c);
        System.out.println("this is NC, " + c);
    }
    public static void main(String[] args) {
        NC nc = new NC(100); // will construct an A first  (1)
    }
} /* output
this is NA, 100
this is NA, 1
this is NB, 111
this is NC, 100
*/
