package add_two_array;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 = new int[array1.length+array2.length];
        for (int i = 0; i<array3.length; i++) {
            if ( i <array1.length ) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        for (int a : array3) {
            System.out.print(a + "\t");
        }
    }
}
