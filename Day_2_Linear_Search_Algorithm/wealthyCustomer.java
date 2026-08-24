public class wealthyCustomer {
    public static void main(String[] args) {
    
        int[][] accounts = {
            {1,2,3},
            {4,5,6,21},
            {1,23,4}
        }  ;
        int wealthy = wealthycustomer(accounts);
        System.out.println(wealthy);

    }
      
    static int wealthycustomer(int[][] array) {

        
        int wealthy = 0;
        for (int person = 0; person < array.length; person++) {
            int sum = 0;
            for(int account : array[person])
            {
                sum += account;
            }
            if (wealthy < sum) {
                wealthy = sum;
            }
        }
        return wealthy;
    }

    
}
