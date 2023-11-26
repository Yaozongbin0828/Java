import java.util.InputMismatchException;
import java.util.Scanner;

public class Page261_test01 {
    public static void main(String[] args) {
        String core = "数学87分，物理76分，英语96分";
        Scanner sc = new Scanner(core);
        //useDelimiter():方法指定正则表达式作为分隔标记
        sc.useDelimiter("[^0123456789.]+");
        double sum = 0;
        int count = 0;
        while (sc.hasNext()) {
            try {
                double score = sc.nextDouble();
                count++;
                sum = sum + score;
                System.out.println(score);
            } catch (InputMismatchException e) {
                String t = sc.next();
            }
        }
        System.out.println("总分:" + sum + "分");
        System.out.println("平均分:" + sum / count + "分");
    }
}
