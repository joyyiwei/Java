package homework;

import java.util.Scanner;

/**
 * Created by acer on 14-9-5.
 */
public class Matirx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("请输入二维矩阵的维度： ");
        n = sc.nextInt();

        int matrix[][] = new int[n+5][n+5];

        System.out.println("请输入二维矩阵：");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("向右旋转90度后效果：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[n-1-j][i] + "\t");
            System.out.println("");
        }

    }
}
