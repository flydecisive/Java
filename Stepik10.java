import java.util.Scanner;

public class Stepik10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int square = number * number;
        int cube = square * number;
        System.out.print(number + " " + square + " " + cube);
    }
}
