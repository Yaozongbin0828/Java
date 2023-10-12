package yao.zongbin;

public class Example4_4 {
    public static void main(String[] args) {
        Rect rect = new Rect();
        double w = 12.76, h = 25.28;
        rect.setWidth(w);
        rect.setHeight(h);
        System.out.println("宽：" + rect.getWidth() + "高:" + rect.getHeight());
        System.out.println("面积：" + rect.getArea());
        System.out.println("更改对象的方法参数传递值的w,h变量的值为100和56");
        w = 100;
        h = 256;
        System.out.println("宽" + rect.getWidth() + "高：" + rect.getHeight());
    }
}
