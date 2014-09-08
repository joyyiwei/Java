package seven;

/**
 * Created by acer on 14-8-13.
 */
class Test {
    private String str;
    public Test() {
        System.out.println("Test");
        str = "Test str";
    }
    public String toString() {return str;}
}
public class Simple {
    private String s1 = "Happy", s2 = "happy", s3, s4;
    private Test test;
    public Simple() {
        System.out.println("Inside Simple()");
        s3 = "joy";
        test = new Test();
    }
    public String toString() {
        if (s4 == null)
            s4 = "joy";
        return "s1 = " + s1 + '\n' +
               "s2 = " + s2 + '\n' +
               "s3 = " + s3 + '\n' +
               "s4 = " + s4 + '\n' +
               "Test = " + test;
    }
    public static void main(String[] args) {
        Simple simple = new Simple();
        System.out.println(simple);
    }
}
