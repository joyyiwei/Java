package Six;

import Six.debug.Power;

/**
 * Created by acer on 14-8-11.
 */
public class TestPower {
    public static void main(String[] args) {
        Power power = new Power();
        power.print1();
        //power.print2(); has protected access
        //power.print3(); has private access
        //power.print3(); has private access
    }
}
