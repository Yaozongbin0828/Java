package yao.zongbin;

import java.util.*;

public class Example2_6 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60}, b, c, d;
        //copyOf()传回的数组是新的数组对象，改变传回数组中的元素值，不会影响原来的数组。
        b = Arrays.copyOf(a, 10);
        System.out.println("数组a的各个元素中的值：");
        System.out.println(Arrays.toString(a)); // [10, 20, 30, 40, 50, 60]
        System.out.println("数组b的各个元素中的值：");
        System.out.println(Arrays.toString(b)); // [10, 20, 30, 40, 50, 60, 0, 0, 0, 0]

        //copyOfRange()指定数组的指定范围复制到一个新的数组中。该范围的最终索引(to) ，必须大于或等于from，可能大于original.length
        c = Arrays.copyOfRange(a, 3, 5);
        System.out.println("数组c的各个元素中的值：");// [40,50]
        System.out.println(Arrays.toString(c));

        d = Arrays.copyOfRange(a, 3, 9);
        System.out.println("数组d的各个元素中的值：");// [40,50,60,0,0,0]
        System.out.println(Arrays.toString(d));
    }
}
