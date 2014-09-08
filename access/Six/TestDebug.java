package Six;

import Six.debugoff.Debug;

/**
 * Created by acer on 14-8-9.
 */
public class TestDebug {
    public static void main(String[] args) {
        String str = new String("I can do it!!");
        Six.debug.Debug.debug(str);
        Debug.debug();
    }
}
