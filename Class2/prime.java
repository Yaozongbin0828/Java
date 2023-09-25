package yao.zongbin;

public class prime {
    //素数：在一个大于1的自然数中，除了1和此整数自身外，不能被其他自然数整除的数。
    public static void main(String args[]) {
        int i, j;
        //外层循环是为了遍历被除数，也就是找我们要输出的素数（如果它是的话），并且将它输出
        for (i = 2; i <= 100; i++) {
            //内层循环是为了遍历除数
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2) {
                System.out.println(i + "是素数！");
            }
        }
    }
}
