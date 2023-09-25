package yao.zongbin;

public class whileSum20items {
    public static void main(String args[]) {
        double sum = 0, item = 1;
        int i = 1;
        while (i <= 20) {
            sum = sum + item;
            i = i + 1;
            item = item * (1.0 / i);
        }
        System.out.println((sum));
    }
}
