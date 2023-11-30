package yaozongbin.co.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example12_4 {
    public static void main(String[] args) {
        int b;
        byte tom[] = new byte[18];
        try {
            File f = new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in\\Example12_4.java");
            FileInputStream in = new FileInputStream(f);
            while ((b = in.read(tom, 0, 18)) != -1) {
                String s = new String(tom, 0, b);
                System.out.println(s);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("" + e);
        }
    }
}
