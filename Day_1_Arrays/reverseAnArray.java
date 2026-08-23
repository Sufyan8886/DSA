import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,20};
        // Reversing the array. 
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            swapValues(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    

    static void swapValues(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
}
