import java.util.Scanner;

public class Stepik3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text =  scan.nextLine();
        scan.close();
        System.out.println(text + " " + text);
        System.out.print(text + "\n" + text);
    }
}
