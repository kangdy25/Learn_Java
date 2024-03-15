package _02_Basic_Grammer_of_Java;

// for "Scanner"
import java.util.*;

public class _Type {
    public static void main(String[] args) {
        // boolean type
        boolean a = true;
        // int, long type
        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        // float, double type;
        float decimal = 1.24f;
        double rate = 1.618d;
        // const variable
        final float PI = 3.14f;
        // char, Stromg
        char ch = 'J';
        String name = "Java";

        // printf
        System.out.printf("PI = %f%n", PI);

        // scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 자리 정수를 하나 입력해주셈 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}
