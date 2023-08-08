package find_min_by_method;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        System.out.println("Input size of array:");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while ( i < size ) {
            System.out.print("Input element "+ (i+1) + " :");
            arr[i] = scanner.nextInt();
            i++;
        }
        for ( int a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
        System.out.println("Min: " + minArray(arr));
    }
    public static int minArray(int[] abc) {
        int min = abc[0];
        for (int i = 0; i<abc.length; i++) {
            if (min>abc[i]) {
                min = abc[i];
            }
        }
        return min;
    }

}
