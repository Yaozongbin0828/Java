package yao.zongbin;

public class Rect {
    double width, height, area;

    void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    void setHeight(double height) {
        if (height > 0) {
            this.height = width;
        }
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    double getArea() {
        area = width * height;
        return area;
    }

    ;
}

class Point {
    int x, y;

    void setXY(int m, int n) {
        x = m;
        y = n;
    }
}
