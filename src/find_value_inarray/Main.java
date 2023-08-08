package find_value_inarray;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Student = { "Hadz", "Dat", "Manh", "Duy", "Nam", "Kien", "Hung"};
        System.out.println("Input Name Student:");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i<Student.length; i++) {
            if (Student[i].equals(name)) {
                System.out.println(name + "located at position "+i+" in the array");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(name + " Not found in the array");
        }
    }
}
