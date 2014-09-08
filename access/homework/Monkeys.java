package homework;

import java.util.Scanner;

/**
 * Created by acer on 14-9-5.
 */
public class Monkeys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("输入m和n： ");
        m = sc.nextInt();
        n = sc.nextInt();

        int vis[] = new int[m+5];
        for (int i = 0; i < m+1; i++)
            vis[i] = 0;

        int x = 1, y = 1, z = 0;
        while (z < m) {
            if ((y % n) == 0) {
                vis[x] = 1;
                z++;
                if (z != m) {
                    System.out.println("第" + y + "轮报数" + "\t" + "第" + x + "只猴子"
                            + "\t" + "因报" + y + "号" + "\t" + "退出" + "\t" + "当前退出" + z + "只");
                }
                else System.out.println("第"+x+"只是猴王");
            }
            y++;
            x = (x % m) + 1;
            while (vis[x] == 1 && z < m) {
                x = (x % m) + 1;
            }
        }
    }
}
