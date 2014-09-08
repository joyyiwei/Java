package seven;

import static net.mindview.util.Print.print;

/**
 * Created by acer on 14-8-14.
 */
class TreeWay {
    void number(byte b) {print(b);}
    void number(short s) {print(s);}
    void number(int i) {print(i);}
}

public class Overload extends TreeWay{
    void number(float f) {print(f);}
    public static void main(String[] args) {
        Overload tmp = new Overload();
        tmp.number((byte)1);
        tmp.number((short)2);
        tmp.number(3);
        tmp.number(4.0f);

    }
}
