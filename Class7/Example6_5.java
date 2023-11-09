package yao.zongbin.io;

import java.text.NumberFormat;

public class Example6_5 {
    public static void main(String[] args) {
        int n = 0, m = 0, t = 6666;
        try {
            //强制转换int类型
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab85");
            t = 9999;
        } catch (NumberFormatException e) {
            System.out.println("发生异常:" + e.getMessage());
            n = 123;
        }
        System.out.println("n=" + n + ",m" + m + ",t=" + t);
    }
}
