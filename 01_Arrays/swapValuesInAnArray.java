import java.util.Arrays;
import java.util.Scanner;

public class swapValuesInAnArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Getting an array from user and asking for indexes to be swapped.
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
           System.out.print("Write integer " + (i+1) + " to be added in array: ");
           arr[i] = inp.nextInt();
        }

        System.out.println("Here is your arra: " + Arrays.toString(arr));
        System.out.print("\nNow write first index to be swapped: ");
        int firstIndex = inp.nextInt();
        System.out.print("\nWrite second index to be swapped: ");
        int secondIndex = inp.nextInt();
        swapValues(arr, firstIndex, secondIndex);

        System.out.println("Here is your swapped array: " + Arrays.toString(arr));



    }

    // Creating a temp variable which makes swap of two values.
    static void swapValues(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}