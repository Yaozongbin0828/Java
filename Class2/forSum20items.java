package yao.zongbin;

public class forSum20items {
    public static void main(String[] args) {
        double sum = 0;
        int i = 1;
        for (int j = 1; j <= 20; j++) {
            i *= j;
            sum += 1.0 / i;
        }
        System.out.println("for循环");
        System.out.println("1 + 1/2! + 1/3! + 1/4! + ···+的前20项和 = " + sum);
    }
}
