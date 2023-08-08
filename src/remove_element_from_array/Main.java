package remove_element_from_array;
import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {
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
        System.out.println("Input random number:");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int j = 0; j<arr.length; j++) {
            if (arr[j] == number) {
                System.out.println(number +" location at position "+(j+1)+ " in array");
                flag = true;
                int[] newArray = new int[arr.length-1];

                for ( int b = 0; b < newArray.length; b++) {
                    newArray[b] = arr[b];
                    if (b>=j) {
                        newArray[b] = arr[b+1];
                    }
                }
                for ( int c : newArray) {
                    System.out.print(c + "\t");
                }
            }
        }
        if (!flag) {
            System.out.println(number +" not in array");
        }
    }
}
