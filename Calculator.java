import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("This is add method");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        return this.add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        return this.add(a, b, c) + d;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int sqrt(int a) {
        return Math.sqrt(a);
    }
}