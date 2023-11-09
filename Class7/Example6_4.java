package yao.zongbin.io;

interface Cubic_ {
    double getCubic(double x);
}

class A_ {
    void f(Cubic cubic) {
        double result = cubic.getCubic(3);
        System.out.println("result=" + result);
    }
}

public class Example6_4 {
    public static void main(String[] args) {
        Cubic_ cu = new Cubic_() {
            @Override
            public double getCubic(double x) {
                return x * x * x;

            }
        };

        System.out.println(cu.getCubic(5));
        cu = (double x) -> {
            return x * x * x;
        };

        System.out.println(cu.getCubic(2));
        A_ a = new A_();
        a.f((double x) -> {
            return x * x * x;
        });
    }

}
