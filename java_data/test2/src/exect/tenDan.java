
public class tenDan{

    public static void main(String[] args) {
        int sum=0;
        System.out.println("1~ 10까지의 숫자 노출");
        for (int a = 1; a <= 10; ++a) {
            System.out.println("" +a);
            sum = sum + a;
        }
        System.out.println("합계는 = " +sum);

        System.out.println("3단");
        int i = 3;
        for (int k = 1; k<10; ++k){
            int s;
            s = i * k;
            System.out.println(i+"X"+k+"="+s);
        }

    }
}