package exect;

import java.sql.SQLOutput;
import java.util.Scanner;

public class dan {
    public static void main(String[] args) {

        while (true) {

            System.out.print("구구단 - 단을 입력(0 or 1 이면 종료) : ");
            Scanner scanner = new Scanner(System.in);

            String strX = scanner.nextLine();
            int dan = Integer.parseInt(strX);

            if(dan == 0 || dan == 1) break;

            for (int i = 1; i <= 9; i++) {
                System.out.println(+dan + "X" + i + "=" + i * dan);
            }

        }

    }

}
