package yaozongbin.co.in.Filetest12;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example12_18 {
    public Example12_18() {
    }

    public static void main(String[] args) {
        File file = new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in\\Filetest12\\goods.txt");
        Scanner sc = null;
        int count = 0;
        double sum = 0;
        try {
            double price = 0;
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+");
            while (sc.hasNextDouble()) {
                price = sc.nextDouble();
                count++;
                sum = sum + price;
                System.out.println(+price);
            }
            double aver = sum / count;
            System.out.println("平均价格"+aver);
        } catch (FileNotFoundException e) {
            System.out.println("error" + e);
        }
    }
}
