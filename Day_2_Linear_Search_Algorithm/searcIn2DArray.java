import java.util.Arrays;

public class searcIn2DArray {
    
    public static void main(String[] args) {
        
        int[][] arr = {

            {1,2,3},
            {4,5,6,7,8,9},
            {12,34,56,78,90},
            {123,456,789}

        } ;
        int target = 456;
        int[] ans = search2darray(arr, target);
        System.out.println(Arrays.toString(ans));


    }

    static  int[] search2darray(int[][] array, int target) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
             if (array[row][col] == target) {
                return new int[]{row,col};
             }   
            }
        }

        return new int[]  {-1,-1};
    }
}
