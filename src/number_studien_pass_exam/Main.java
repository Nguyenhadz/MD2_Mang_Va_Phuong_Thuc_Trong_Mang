package number_studien_pass_exam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size:");
            size = scanner.nextInt();
            if ( size > 30) {
                System.out.println("Invalid number.");
            }
        } while (size>30);
        arr = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("Input element "+(i+1)+" :");
            arr[i] = scanner.nextInt();
            i++;
        }
        for (int item : arr) {
            System.out.print(item + "\t");
        }
        int count = 0;
        for (int item : arr) {
            if (item>=5) {
                count += 1;
            }
        }
        System.out.println();
        System.out.println("The number of students passing the course is "+count);
    }
}
