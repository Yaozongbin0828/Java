package yaozongbin.co.in.Filetest12;

import java.io.*;

public class Student implements Serializable {
    String name = null;
    double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
