以下是用Java编写的求一元二次方程的根的算法：

```java
public class QuadraticEquationSolver {
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double[] result;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = new double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            result = new double[]{root};
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.format("Root 1 = %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.format("Root 2 = %.2f - %.2fi%n", realPart, imaginaryPart);
            result = new double[]{realPart + imaginaryPart, realPart - imaginaryPart};
        }

        return result;
    }

    public static void main(String[] args) {
        double[] roots = solveQuadraticEquation(1, -3, 2);
        for (double root : roots) {
            System.out.println(root);
        }
    }
}
```

在这个示例中，`solveQuadraticEquation` 方法接受三个参数 `a`、`b` 和 `c`，分别代表一元二次方程的系数。根据判别式的值，方法计算并返回方程的根。在 `main` 方法中，展示了如何调用这个方法并输出方程的根。
