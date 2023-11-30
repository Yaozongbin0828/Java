package yaozongbin.co.in;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example12_5 {
    public static void main(String[] args) {
        byte[] a = "新年快乐".getBytes();
        byte[] b = "Happy New Year".getBytes();
        File file = new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in\\test.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            System.out.println(file.getName() + "" + file.length() + "");
            out.write(a);
            out.close();
            out = new FileOutputStream(file, true);
            System.out.println(file.getName() + "的大小" + file.length() + "字节");

            out.write(b, 0, b.length);
            System.out.println(file.getName() + "的大小" + file.length() + "字节");
            out.close();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }
}
