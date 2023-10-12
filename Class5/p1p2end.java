package yao.zongbin;


public class p1p2end {
    public static void main(String[] args) {
//        Rect Point = new Point;

        Point x1, x2;
        x1 = new Point();
        x2 = new Point();
        x1.setXY(1111, 2222);
        x2.setXY(-100, -200);
        System.out.println("x1" + x1.x + "Y" + x1.y);
        System.out.println("x2" + x2.x + "Y" + x2.y);

        x1 = x2;
        System.out.println("x1" + x1);
        System.out.println("x2" + x2);
    }
}
