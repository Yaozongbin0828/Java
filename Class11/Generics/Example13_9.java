package Generics;

import java.util.*;

class StudentKey implements Comparable {
    double d = 0;

    StudentKey(double d) {
        this.d = d;
    }

    @Override
    public int compareTo(Object b) {
        StudentKey st = (StudentKey) b;
        if ((this.d - st.d) == 0)
            return -1;
        else return (int) ((this.d - st.d) * 1000);
    }
}

class Student {
    String name = null;
    double math, english;

    Student(String s, double m, double e) {
        name = s;
        math = m;
        english = e;
    }

}

public class Example13_9 {
    public static void main(String[] args) {
        TreeMap<StudentKey, Student> treeMap = new TreeMap<StudentKey, Student>();
        String str[] = {"赵一", "钱二", "孙三", "李四"};
        double math[] = {89, 45, 78, 76};
        double english[] = {67, 66, 90, 56};
        Student student[] = new Student[4];
        for (int k = 0; k < student.length; k++) {
            student[k] = new Student(str[k], math[k], english[k]);
        }
        StudentKey key[] = new StudentKey[4];
        for (int k = 0; k < key.length; k++) {
            key[k] = new StudentKey(student[k].math);
        }
        for (int k = 0; k < student.length; k++) {
            treeMap.put(key[k], student[k]);
        }
        int number = treeMap.size();
        System.out.println("树映射中有" + number + "个对象，按数学成绩排序：");
        Collection<Student> collection = treeMap.values();
        Iterator<Student> iter = collection.iterator();
        while (iter.hasNext()) {
            Student stu = iter.next();
            System.out.println("姓名" + stu.name + "数学" + stu.math);
        }
        treeMap.clear();
        for (int k = 0; k < key.length; k++) {
            key[k] = new StudentKey(student[k].english);
        }
        for (int k = 0; k < student.length; k++) {
            treeMap.put(key[k], student[k]);
        }
        number = treeMap.size();
        System.out.println("树映射中有" + number + "个对象，按英语成绩排序：");
        collection = treeMap.values();
        iter = collection.iterator();
        while (iter.hasNext()) {
            Student stu = (Student) iter.next();
            System.out.println("姓名" + stu.name + "英语" + stu.english);
        }
    }
}
