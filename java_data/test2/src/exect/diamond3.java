package exect;
import java.util.Scanner;

public class diamond3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("다이아몬드 중앙 숫자입력를 입력하시오(홀수) :");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.println();
        printDiamond(num);
    }
    public static void printDiamond(int num) {
        int spaces = num / 2;
        int stars = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < num / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
