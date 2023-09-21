package yao.zongbin;

public class Example2_4 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {100, 200, 300};
        System.out.println("数组a的元素个数=" + a.length); //4
        System.out.println("数组b的元素个数=" + b.length); //3
        System.out.println("数组a的引用" + a); //[I@31befd9f 一维数组
        System.out.println("数组b的引用" + b); //[I@1c20c684 一维数组
        System.out.println("a==b的结果是" + (a == b)); //false

        a = b;
        System.out.println("数组a的元素个数=" + a.length); //3
        System.out.println("数组b的元素个数=" + b.length); //3
        System.out.println("a==b的结果是" + (a == b));  // ture
        System.out.println("a[0]=" + a[0] + ", a[1] = " + a[1] + ", a[2]=" + a[2]); //a[0]=100, a[1] = 200, a[2]=300
        System.out.println("b[0]=" + b[0] + ", b[1] = " + b[1] + ", b[2]=" + b[2]); //b[0]=100, b[1] = 200, b[2]=300

    }
}
