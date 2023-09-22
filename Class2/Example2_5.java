package yao.zongbin;
//调用Array库

import java.util.Arrays;

public class Example2_5 {
    public static void main(String[] args) {
        //byte 型数组元素默认初始值是 0
        //short 型数组元素的默认初始值是 0
        //int 型数组元素的默认初始值是 0
        //long 型数组元素的默认初始值是 0L
        //char 型数组元素的默认初始值是 .u.000
        //float 型数组元素的默认初始值是 0.0f
        //double 型数组元素的默认初始值是 0.0d
        //boolean 型数组元素的默认初始值是 false

        char[] a = {'a', 'b', 'c', 'd', 'e', 'f'},
                b = {'1', '2', '3', '4', '5', '6'};
        int[] c = {1, 2, 3, 4, 5, 6,},
                d = {10, 20, 30, 40, 50, 60};
        // arraycopy() 利用循环把一个数组的元素的值赋给另一个数组中元素
        System.arraycopy(a, 0, b, 0, a.length);
        System.arraycopy(c, 2, d, 2, c.length - 3);

        System.out.println("数组a的各个元素中的值:");
        System.out.println(Arrays.toString(a));
        System.out.println("数组b的各个元素中的值:");
        System.out.println(Arrays.toString(b));
        System.out.println("数组c的各个元素中的值:"); // [1,2,3,4,5,6]
        System.out.println(Arrays.toString(c));
        System.out.println("数组d的各个元素中的值:"); // [10,20,3,4,5,,60]
        System.out.println(Arrays.toString(d));

    }
}
