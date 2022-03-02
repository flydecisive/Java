import java.util.Scanner;

public class Stepik12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int digit = Math.abs(number % 10);
        System.out.print(digit);
    }
}
