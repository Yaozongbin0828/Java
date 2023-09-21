package yao.zongbin;

public class Example2_2 {

    public static void main(String[] args) {
        byte b = 22;
        int n = 129;
        float f = 123456.6789f;
        double d = 1234567889.1234567789;
        System.out.println("b=" + b);
        System.out.println("n=" + n);
        System.out.println("f=" + f);
        System.out.println("d=" + d);

        b = (byte) n;       //导致精度的损失 b是byte类型超过范围
        f = (float) d;      //导致精度的损失

        System.out.println("b=" + b);
        System.out.println("f=" + f);

    }
}
