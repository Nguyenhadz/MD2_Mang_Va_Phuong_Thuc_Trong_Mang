package reverse_array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size>20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size>20);
        arr = new int[size];
        int i = 0;
        while (i<arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int a = 0; a< arr.length; a++) {
            System.out.print(arr[a] + "\t");
        }
        for (int b = 0; b<arr.length/2; b++) {
            int temp = arr[b];
            arr[b] = arr[arr.length-1-b];
            arr[arr.length-1-b] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
