package app;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        variableInfo();
        handleData();
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static void variableInfo() {
        a = 8;
        b = 2;
    }

    private static void handleData() {
        int c = add(a, b);
        System.out.println(c);
        int m = multiply(a, b);
        System.out.println(m);
        int s = subtraction(a, b);
        System.out.println(s);
        int d = division(a, b);
        System.out.println(d);
    }
}
