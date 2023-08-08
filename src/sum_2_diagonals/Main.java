package sum_2_diagonals;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = scanner.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i<length; i++) {
            for (int j = 0; j<length; j++) {
                System.out.println("Input element:");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i<length; i++) {
            System.out.println();
            for (int j = 0; j<length; j++) {
                System.out.print(array[i][j]+ "\t");
            }
        }
        int sum = 0;
        for (int i = 0; i<length; i++) {
            sum+= array[i][i] +array[i][length-1-i];
        }
        System.out.println();
        System.out.println("The sum of the two principal diagonals of the matrix is: "+sum);
    }
}
