import java.util.Scanner;

public class Stepik14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allSeconds = scan.nextInt();
        scan.close();
        int hours = allSeconds % 86400 / 3600;
        int minutes = allSeconds % 3600 / 60;
        int seconds = allSeconds % 60;
        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", hours, minutes, seconds);
    }
}
