package yao.zongbin.io;

abstract class Speak {
    public abstract void speakHello();
}

class Student {
    void f(Speak sp) {
        sp.speakHello();
    }
}

public class Example6_2 {
    public static void main(String[] args) {
        Speak speak = new Speak() {
            //匿名类重写父类方法
            @Override
            public void speakHello() {
                System.out.println("大家好，祝大家工作顺利");
            }
        };

        speak.speakHello();
        Student st = new Student();
        st.f(new Speak() {
            //匿名类重写父类方法
            @Override
            public void speakHello() {
                System.out.println("I'm a student,how are you");
            }
        });
    }
}
