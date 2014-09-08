package homework;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by acer on 14-9-5.
 */
public class Narcissus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n;
        n = sc.nextInt();

        for (long i = (long)pow(10, n-1); i < (long)pow(10, n); i++) {
            long sum = 0, tmp = i;
            while (tmp != 0) {
                sum += (long)pow((tmp%10), n);
                tmp /= 10;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
        System.out.println("");

    }
}
