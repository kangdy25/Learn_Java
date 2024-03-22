package _02_Basic_Grammer_of_Java;

public class _BitwiseOperators {
    // 10진 정수를 2진수로 변환하는 메서드
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);

        return tmp.substring(tmp.length()-32);
    }

    public static void main(String[] args) {
        int x = 0xAB;
        int y = 0xF;

        System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t%s%n", x, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
        System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
        System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
        System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

        byte p =  10;
        byte n = -10;

        System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));
        System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));
        System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
        System.out.printf("~~p =%d \t%s%n", ~~p,  toBinaryString(~~p));

        // Shift Operator
        int dec = 8;

        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0,  dec >> 0,  toBinaryString(dec << 2));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec << 2));
    } // main의 끝
}
