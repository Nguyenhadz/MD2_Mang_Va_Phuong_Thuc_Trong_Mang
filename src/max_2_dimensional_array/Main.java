package max_2_dimensional_array;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length array:");
        int length = scanner.nextInt();
        int[][] array = new int[length][];
        for (int i=0; i< length; i++) {
            System.out.println("Input length array["+ i +"]:");
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
        int max = array[0][0];
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Max :" +max);
    }
}
