package exect;

import java.util.Scanner;

public class diamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String strX = scanner.nextLine();
        int n = Integer.parseInt(strX);

        System.out.print("숫자 입력");
        System.out.println("");

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 별표 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // 다음 줄로 이동
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 별표 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // 다음 줄로 이동
            System.out.println();
        }
    }
}