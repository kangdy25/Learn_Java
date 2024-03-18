package _02_Basic_Grammer_of_Java;

public class _TypeCasting {
    public static void main(String[] args) {
        // Basic Type Casting
        double d = 85.4;
        int score = (int)d;

        System.out.println("score = " + score);
        System.out.println("d = " + d);

        // Type Casting between integer types
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

        System.out.println("i = " + Integer.toBinaryString(i));

        // Type Casting between Floating-point types
        float f = 9.1234567f;
        double d1 = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d1 = %20.18f\n", d1);
        System.out.printf("d2 = %20.18f\n", d2);

        // Type Casting between integer and floating-point types
        int i1 = 91234567;
        float f1 = (float)i1;
        int i2 = (int)f1;

        double D = (double)i1;
        int i3 = (int)D;

        float f2 = 1.777f;
        int i4 = (int)f2;

        System.out.printf("i = %d\n", i1);
        System.out.printf("f = %f i2 = %d\n", f1, i2);
        System.out.printf("d = %f i3 = %d\n", D, i3);
        System.out.printf("(int) %f = %d\n", f2, i4);
    }
}
