package height;

import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        System.out.println("空格隔开若干格数，#号结尾，\n输出");
        Scanner reader = new Scanner(System.in);  //   int
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();

            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均数" + sum / m);

        System.out.printf("%5d\n", m);
        System.out.printf("%5.8f\n", sum/m);
    }
}

