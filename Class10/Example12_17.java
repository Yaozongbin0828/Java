package yaozongbin.co.in.Filetest12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example12_17 {
    public static void main(String[] args) {
        File file = new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in\\Filetest12\\student.txt");
        Scanner sc = null;
        int count = 0;
        double sum = 0;
        try {
            int score = 0;
            sc = new Scanner(file);
            while (sc.hasNextInt()) {
                score = sc.nextInt();
                count++;
                sum = sum + score;
                System.out.println(score);
            }
            double aver = sum / count;
            System.out.println("平均成绩"+aver);
        } catch (FileNotFoundException e) {
            System.out.println("error" + e);
        }
    }
}
