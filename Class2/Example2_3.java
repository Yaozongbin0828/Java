package yao.zongbin;

import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        System.out.println("用空格(或回车)做分割,输入若干个数，最后输入#结束，\n然后回车确认.");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            // nextDoubel()方法：判断有没有下一个双精度类型输入，返回boolean类型
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的和为" + sum / m);
    }
}
