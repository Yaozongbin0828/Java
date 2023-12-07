package yaozongbin.co.in.Filetest12;

import java.io.*;
import java.io.Serializable;
public class Example12_4 {
    public static void main(String[] args) {
        Student zhang = new Student();
        zhang.setName("张三");
        zhang.setHeight(1.76);
        File file = new File("people.txt");
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(zhang);
            objectOut.close();

            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student li = (Student) objectIn.readObject();

            li.setName("李四");
            li.setHeight(1.65);
            System.out.println(zhang.name + "height" + zhang.height);
            System.out.println(li.name + "height" + li.height);

        } catch (ClassNotFoundException e) {
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
