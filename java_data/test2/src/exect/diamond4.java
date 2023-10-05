package exect;
import java.util.Scanner;

public class diamond4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("다이아몬드 중앙 숫자 입력(홀수): ");
        int num = sc.nextInt();
        sc.close();
        //값 입력

        if (num % 2 == 0) {
            System.out.println("잘못된 입력입니다. 홀수를 입력하세요.");
            return;
        }
        //잘못된 정보 기입시 오류값 노출

        int spaces = num / 2;
        int stars = 1;
        //마름모 제작을 위한 변수 선언 및 초기값 설정

        for (int i = 0; i < num; i++) {
            String line = " ".repeat(spaces) + "*".repeat(stars);
            System.out.println(line);

            if (i < num / 2) {
                spaces--;
                stars += 2;

            } else {
                spaces++;
                stars -= 2;
            //if문 활용하여 마름모 모양 작성

            }
        }
    }

}
