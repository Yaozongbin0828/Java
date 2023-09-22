package yao.zongbin;

import java.util.Scanner;

enum Season {
    春, 夏, 秋, 冬
}

public class Example2_8 {
    public static void main(String[] args) {
        Season x = null;
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        // int n = 4;
        if (n == 1) {
            x = Season.春;

        } else if (n == 2) {
            x = Season.夏;

        } else if (n == 3) {
            x = Season.秋;

        } else if (n == 4) {
            x = Season.冬;
            System.out.println("现在是" + x);
        }
    }
}
