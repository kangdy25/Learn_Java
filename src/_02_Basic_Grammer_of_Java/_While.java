package _02_Basic_Grammer_of_Java;
import java.util.*;

public class _While {
    public static void main(String[] args) {
        // While
        int sum = 0;
        int i   = 0;

        while((sum += ++i) <= 100) { // i를 1씩 증가시켜서 sum에 계속 더해나간다.
            System.out.printf("%d - %d%n", i, sum);
        }

        // Do-While
        int input  = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");

            String tmp = scanner.nextLine();
            input = Integer.parseInt(tmp);

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while(input!=answer);

        System.out.println("정답입니다.");

        int menu = 0;
        int num  = 0;

        Scanner scanner1 = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            String tmp = scanner1.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
            menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

            if(menu==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }

            System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
        }
        // for문에 Loop1이라는 이름을 붙였다.
        Loop1 : for(int p=2 ;p <=9;p++) {
            for(int j=1;j<=9;j++) {
                if(j==5)
                    break Loop1;
//						break;
//						continue Loop1;
//						continue;
                System.out.println(p+"*"+ j +"="+ p*j);
            } // end of for i
            System.out.println();
        } // end of Loop1

    }
}
