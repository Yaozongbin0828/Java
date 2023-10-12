package yao.zongbin;

public class Example4_5 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        Circular circular = new Circular(circle, 20);
        System.out.println(circular.bottom);
        System.out.println(circular.getBottomRadius());
        System.out.println(circular.getVolme());

        double r = 8888;
        System.out.println(r);
        circular.setBottomRadius(r);
        System.out.println(circular.getBottomRadius());
        System.out.println(circular.getVolme());
        System.out.println(circle.getRadius());

        System.out.println("main方法circle的引用发生变化");
        circle=new Circle(100);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circular.bottom);
        System.out.println(circular.getBottomRadius());
    }
}
