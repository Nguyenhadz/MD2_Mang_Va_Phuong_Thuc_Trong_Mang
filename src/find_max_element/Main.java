package find_max_element;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Input size of array:");
            size = scanner.nextInt();
            if ( size > 20) {
                System.out.println("Size should not exceed 20.");
            }
        } while (size > 20);
        array = new int[size];
        int max;
        int index = 0;
        int i = 0;
        while (i<array.length) {
            System.out.println("Input element "+ (i+1) +" of array:");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int a=0; a < array.length; a++) {
            System.out.print(array[a]+ "\t");
        }
        max = array[0];
        for (int j=0; j < array.length; j++) {
            if ( max < array[j]) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
