public class Hexlet1 {
    public static void main(String[] args) {
        var name = "hexlet";
        var firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        var otherText = name.substring(1);
        var total = firstLetter + otherText;
        System.out.print(total);
    }
}
