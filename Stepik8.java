import java.util.Scanner;

public class Stepik8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstSide = scan.nextDouble();
        double secondSide = scan.nextDouble();
        scan.close();
        double perimeter = (firstSide + secondSide) * 2;
        double square = firstSide * secondSide;
        System.out.print(perimeter + "\n" + square);
    }
}
