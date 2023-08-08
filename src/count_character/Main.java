package count_character;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any string: ");
        String string = scanner.nextLine();
        String[] array = string.split("");
        System.out.println("Input any character:");
        String a = scanner.nextLine();
        int count = 0;
        for (String item : array) {
            if (item.equals(a)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
