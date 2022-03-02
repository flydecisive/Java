import java.util.Scanner;

public class Stepik11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int thirdNum = scan.nextInt();
        scan.close();
        double result = (firstNum + secondNum + thirdNum) / 3;
        System.out.print(result);
    }
}
