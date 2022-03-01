import java.util.Scanner;

public class Stepik7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fNum = scan.nextInt();
        int sNum = scan.nextInt();
        scan.close();
        int result = fNum + sNum;
        System.out.print(result);
    }
}
