package add_element_to_array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("%-15s", "Array");
        for (int a : arr) {
            System.out.print(a +"\t");
        }
        System.out.println();
        System.out.println("Input Value:");
        int value = scanner.nextInt();
        System.out.println("Input Index:");
        int index = scanner.nextInt();
        if (index<=-1 || index >= arr.length) {
            System.out.println("Can not add to array");
        } else {
            int[] newArray = new int[arr.length+1];
            for (int i  = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = value;
                } else  if (i>index){
                    newArray[i] = arr[i -1];
                } else {
                    newArray[i] = arr[i];
                }
            }
            System.out.printf("%-15s", "New Array");
            for (int b : newArray) {
                System.out.print(b +"\t");
            }
        }

    }
}
