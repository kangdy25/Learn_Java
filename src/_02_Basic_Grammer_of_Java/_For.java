package _02_Basic_Grammer_of_Java;
import java.util.*;

public class _For {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환

        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int[] arr = {10,20,30,40,50};
        int sum = 0;

        // Enhanced for Statement
        for(int i=0;i<arr.length;i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for(int tmp2 : arr) {
            System.out.printf("%d ", tmp2);
            sum += tmp2;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}
