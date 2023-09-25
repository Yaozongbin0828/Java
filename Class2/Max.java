package yao.zongbin;

import java.util.Scanner;

public class Max {
    public static void main(String args[]) {

        System.out.println("输入两个数");

        Scanner reader = new Scanner(System.in);

        int a, b;

        a = reader.nextInt();

        b = reader.nextInt();

        System.out.println("最大公约数为:" + gcd(a, b));

        System.out.println("最小公倍数为:" + lcm(a, b));

    }

    public static int gcd(int a, int b) {

        int max = 1;

        for (int i = 1; i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                if (i > max) {

                    max = i;

                }

            }

        }
        return max;

    }

    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

}

