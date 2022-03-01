import java.util.Scanner;

public class Stepik9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        double y = 5 * (x * x) + 2 * x + 11;
        System.out.print(y);
    }
}
