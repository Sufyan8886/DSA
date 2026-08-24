public class maxIn2DArray {

    public static void main(String[] args) {
        
        int[][] arr = {

            {1,2,3},
            {4,5,6,7,8,9},
            {12,34,56,78,90},
            {123,456,789}

        } ;

        int maximum = maxin2darray(arr);
        System.out.println(maximum);
    }


    static int maxin2darray(int[][] array) {

        int max = array[0][0];

        for (int row = 0; row < array.length; row++) {
            
            for (int col = 0; col < array[row].length; col++) {
                if (max < array[row][col]) {
                    max = array[row][col];
                }
            }
        }

        return max;
    } 

    
    
}
