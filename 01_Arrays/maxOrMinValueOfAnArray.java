import java.util.Arrays;

public class maxOrMinValueOfAnArray {
    public static void main(String[] args) {
        int[] arr = {242,434,546,313,56,546,876}; 
        int max = maxValue(arr);
        int min = minValue(arr);
        
        System.out.print("In the array : " + Arrays.toString(arr));
        System.out.println("Max value is: " + max);
        System.out.println("And min value is: " + min);
    }

    static int maxValue(int[] array) {
     

        // Iterating through array 
        int max = array[0];
        // Checking if max value is less than current array value, then allocate max to that value.
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
        
    }

    static int minValue(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            // if recent array value is less than min, min is assigned that value. 
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
