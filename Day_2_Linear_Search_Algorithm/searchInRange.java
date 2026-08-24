package Day_2_Linear_Search_Algorithm;

public class searchInRange {
    public static void main(String[] args) {

        int[] nums = {2,23,4454,55,343,12,23,646,768,879,998,9898,66,3,24,78};
        int start = 3;
        int end = 8;
        int target = 12;
        Boolean search = searchinrange(nums, start, end, target);
        System.out.println(search);
        
    }

    static Boolean searchinrange(int[] array, int index1, int index2, int target) {

        for (int i = index1; i < index2 ; i++) {
            if ( target == array[i]) {
                return true;
            }
        }

    
        return false;
    }
}
