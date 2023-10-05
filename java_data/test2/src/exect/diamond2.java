package exect;

import java.util.Scanner;

public class diamond2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strX = scanner.nextLine();
        int n = Integer.parseInt(strX);

        System.out.print("숫자 입력");
        System.out.println("");

        for (int i = 1; i <= n * 2 - 1; i++) {
            int spaces = Math.abs(n - i);

            int stars = n * 2 - spaces * 2;
            // 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            // 별표 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            // 다음 줄로 이동
            System.out.println();
        }
    }
}




