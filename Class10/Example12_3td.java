package yaozongbin.co.in.Filetest12;

import java.io.File;

public class Example12_3td {
//  File txt
    public static void main(String[] args) {
        try {
            Runtime ce = Runtime.getRuntime();
            File file = new File("c:/windows", "Notepad Example12_3.txt");
            ce.exec(file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
