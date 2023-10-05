package exect;
import java.util.Scanner;

public class diamond_1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("라인 입력 : ");
            int line = sc.nextInt();
            int star = 1;
            int space = line / 2;
            int i,j;

            for(i = 0; i < line; i++) {
                for(j = 0; j < space; j++)
                    System.out.print(" ");

                for(j = 0; j < star; j++)
                    System.out.print("*");

                System.out.println();

                if (i < line / 2) {
                    star += 2;
                    space--;
                }else {
                    star -= 2;
                    space++;
                }
            }

        }
}


