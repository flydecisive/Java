import java.util.Scanner;

public class Stepik13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int salary = scan.nextInt();
        scan.close();
        int maxWorkers = money / salary;
        int remainingMoney = money % salary;
        System.out.print(maxWorkers + " " + remainingMoney);
    }
}
