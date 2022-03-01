import java.util.Scanner;

public class Stepik6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullUserName = scan.nextLine();
        String helperName = scan.nextLine();
        int messages = scan.nextInt();
        scan.close();
        System.out.println("Привет, " + fullUserName + ", это твой помощник " +
                helperName + ".");
        System.out.print("У тебя " + messages + " новых писем.");
    }
}
