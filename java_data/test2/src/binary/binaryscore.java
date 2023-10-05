package binary;

public class binaryscore {
    public static void main(String[] args) {

        int score = 90;

        if (score >= 85) {
            System.out.println("A등급입니다.");

        }
        else if (85 > score || score>= 80) {
            System.out.println("B등급입니다.");

        }
        else {
            System.out.println("C등급입니다.");

        }
    }
}
