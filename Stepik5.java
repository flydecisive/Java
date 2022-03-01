import java.util.Scanner;

public class Stepik5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        String month = scan.nextLine();
        String day = scan.nextLine();
        scan.close();
        System.out.print(day + ":" + month + ":" + year);
    }
}
