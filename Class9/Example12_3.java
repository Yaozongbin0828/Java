package yaozongbin.co.in;

import java.io.File;

public class Example12_3 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("C:/windows\\Notepad.exe D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in\\Example12_4.java");;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
