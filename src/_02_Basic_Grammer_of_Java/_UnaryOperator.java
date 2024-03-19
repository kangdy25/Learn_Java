package _02_Basic_Grammer_of_Java;

public class _UnaryOperator {
    public static void main(String args[]) {
        // Unary Operator (++, --, +, -)
        int i = 5;
        i++;
        System.out.println(i);

        i = 5;
        ++i;
        System.out.println(i);

        int a = 5, b = 0;
        b = a++;
        System.out.println("b = a++; 실행 후, a = " + a + ", b = " + b);

        a = 5;
        b = 0;
        b = ++a;
        System.out.println("b = a++; 실행 후, a = " + a + ", b = " + b);

        int p = -10;
        p = +p;
        System.out.println(p);

        p = -10;
        p = -p;
        System.out.println(p);
    }
}
