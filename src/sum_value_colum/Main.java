package sum_value_colum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length array:");
        int length = scanner.nextInt();
        int[][] array = new int[length][];
        for (int i= 0; i<length;i++) {
            System.out.println("Input length array[" + i +"] :");
            int size = scanner.nextInt();
            int[] a = new int[size];
            for (int j = 0; j< size; j++) {
                System.out.println("Input element "+j+" :");
                a[j] = scanner.nextInt();
            }
            array[i] = a;
        }
        for (int i = 0; i<array.length; i++) {
            System.out.println();
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("Input Colum:");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum+=array[i][col-1];
        }
        System.out.println("Total Colum "+col+" is: "+sum);

    }
}
