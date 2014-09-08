package homework;

import java.util.Scanner;

/**
 * Created by acer on 14-9-5.
 */
public class MulTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i + "X" + j + "=" + (i*j) + "\t");
            }
            System.out.println(i + "X" + i + "=" + (i*i));
        }

    }
}
