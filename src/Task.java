import java.util.Scanner;
import java.lang.Integer;
public class Task {
    public static void main(String[] args) {
        System.out.println("введи число");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println(isPowerOfTwo(number));
    }
    public static boolean isPowerOfTwo(int number){
        int moduleOfNumber=Math.abs(number);
        String x = Integer.toBinaryString(moduleOfNumber);
        int degree =x.length()-1;
        int degreeOfTwo= (int) Math.pow(2,degree);
        return moduleOfNumber==degreeOfTwo;
    }
}
