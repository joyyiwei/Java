package Six;

import mypackage.Mypackage;

/**
 * Created by acer on 14-8-9.
 */
public class Example extends Mypackage{
    public void chomp() {
        bite();
    }
    public static void main(String[] args) {
        Example example = new Example();
        example.chomp();
        printf();
    }
}
