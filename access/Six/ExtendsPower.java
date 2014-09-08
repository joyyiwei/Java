package Six;

import Six.debug.Power;

/**
 * Created by acer on 14-8-11.
 */
public class ExtendsPower extends Power{
    void chomp() {
        print2();
    }
    public static void main(String[] args) {
        ExtendsPower tmp = new ExtendsPower();
        tmp.chomp();
    }
}
