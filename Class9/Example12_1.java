package yaozongbin.co.in;

import java.io.File;

public class Example12_1 {
    public static void main(String[] args) {
        File f1 =new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in","A_.java");
        File f2 =new File("D:\\Class7\\yaozongbin.com.in");
        System.out.println(f1.getName()+"是可读的吗？"+f1.canRead());
        System.out.println(f1.getName()+"是可读的吗？"+f1.length());
        System.out.println(f1.getName()+"的绝对路径"+f1.getAbsolutePath());
        System.out.println(f2.getName()+"是目录吗？"+f2.isDirectory());
        System.out.println(f2.getName()+"是普通文件吗？"+f2.isFile());
        System.out.println(f1.getName()+"是普通文件吗？"+f1.isFile());
        System.out.println(f1.getName()+"是隐藏文件吗？"+f1.isHidden());
        System.out.println(f1.getName()+"文件最后修改时间"+f1.lastModified());
        System.out.println(f1.getName()+"父目录"+f1.getParent());

    }
}
