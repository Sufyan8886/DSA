package Day_2_Linear_Search_Algorithm;

public class linearSearch {
    public static void main(String[] args) {
        
        int[] nums = {23,424, 4343, 5, 65, 78,68};
        int target = 5;
        int ans = linearsearch(nums, target);
        System.out.println("The target is at index: " +ans);
    }

    // Iterate through every element/index in an array untill target is found
    static int linearsearch(int[] array, int target) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        // If the value at index i is equal to target, return the index number. 
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
