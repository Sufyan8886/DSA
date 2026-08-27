package Day_2_Linear_Search_Algorithm;
public class evenDigitsInArray {

    public static void main(String[] args) {
    
        int[] nums = {12,4,677,34,66565,454543};

        int even = findEvenNumbers(nums);
        System.out.println(even);
    }

    static int digitsCount(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return -1;
        }

        // Method 1 -> make a counter and check if num is divisile by 10. If it is increment count
        // it will be like for num = 55
        // 55/10 = answers is 5. So count will be 1.
        // int count = 0;
        // while (num > 0) {
        //     count++;
        //     num = num / 10;
        // }
        //    return count;

        // Method 2-> Instead of while loop for dividing number by 10 untill single digit. 
        // We can simply take log 10 of that number. 
        return (int)(Math.log10(num)) + 1;
    }

    static Boolean evendigits(int num ) {

        int digits = digitsCount(num);

        // Method 1 ->  If the digits divided by 2 leave remainder of 0, its even else not.
        // create if condition to check that 
        // if (digits % 2 == 0) {
        //     return true;
        // }
        //     return false;


        // Method 2 -> Optmised slution.Instead of if statement. directly check in return.
         return digits % 2 == 0;
    }

    static int findEvenNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (evendigits(i)) {
                count++;
            }
        }
        return count;
    }
    
}
