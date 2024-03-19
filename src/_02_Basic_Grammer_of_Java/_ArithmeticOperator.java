package _02_Basic_Grammer_of_Java;

public class _ArithmeticOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n",  a, b, a + b);
        System.out.printf("%d - %d = %d\n",  a, b, a - b);
        System.out.printf("%d * %d = %d\n",  a, b, a * b);
        System.out.printf("%d / %d = %d\n",  a, b, a / b);
        System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);

        byte p = 10;
        byte q = 30;
        byte r = (byte)(p * q);
        System.out.println(r);

        long s = 1000000 * 1000000;
        long t = 1000000 * 1000000L;

        System.out.println("s="+s);
        System.out.println("t="+t);

        char alpabet_a = 'a';
        char alpabet_d = 'd';

        char zero = '0';
        char two  = '2';

        System.out.printf("'%c' - '%c' = %d\n", alpabet_d, alpabet_a, alpabet_d - alpabet_a); // 'd' - 'a' = 3
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
        System.out.printf("'%c'=%d\n", alpabet_a, (int)alpabet_a);
        System.out.printf("'%c'=%d\n", alpabet_d, (int)alpabet_d);
        System.out.printf("'%c'=%d\n", zero, (int)zero);
        System.out.printf("'%c'=%d\n", two,  (int)two);

        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        double shortPi2 = Math.round(pi * 1000) / 1000.0;

        System.out.println(shortPi);
        System.out.println(shortPi2);

        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면, \n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", x / y, x % y);
    }
}
