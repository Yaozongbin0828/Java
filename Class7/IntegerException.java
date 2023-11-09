package yao.zongbin.io;

//调用 Exception——> {Throwable}
public class IntegerException extends Exception {
    String message;

    public IntegerException(int m) {
        message = "年龄" + m + "不合理";
    }

    public String toString() {
        return message;
    }
}
