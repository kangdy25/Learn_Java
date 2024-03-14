package _02_Basic_Grammer_of_Java;

public class _Variable {
    public static void main(String[] args) {
        // Allocation of Variables
        int year = 0;
        int age = 24;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);

        // Swap data values
        int x = 10, y = 20;
        int tmp = 0;
        System.out.println("x: " + x + " y : " + y);

        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x: " + x + " y : " + y);
    }
}
