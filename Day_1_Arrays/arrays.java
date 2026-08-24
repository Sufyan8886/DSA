import java.util.Arrays;
import java.util.Scanner;

public class arrays {
public static void main(String[] args) {
  // Input Scanner
    Scanner in = new Scanner(System.in);

    //  Manually storing values
    int[] arr = new int[5];
    arr[0] = 2;
    arr[1] = 45;
    arr[2] = 76;
    arr[3] = 12;
    arr[4] = 6;
     // [2,45,76,12,6]
 

    // toString();
    System.out.print(Arrays.toString(arr));

    //  Taking input through for loop
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Write an integer: ");
      arr[i] = in.nextInt();
      
    }

    // For and For Each Loop
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }


    //  Array Of Objects
    String[] str = new String[4];

    for (int i = 0; i < str.length; i++) {
      str[i] = in.next();
    }
      System.out.print(Arrays.toString(str));

    

    // Passing array into a Function
  int[] samarr = {2,3,4,5,6,7};
   System.out.print(Arrays.toString(samarr));
   System.out.println("After change: ");
   change(samarr);
   System.out.print(Arrays.toString(samarr));


  //  2D Arrays
    int[][] twoDarr = {{1,2,3},{4,5,6},{8,9,10}};
   for (int row = 0; row < twoDarr.length; row++) {
    
     for (int col = 0; col < twoDarr[row].length; col++) {
         System.out.print(twoDarr[col][row] + " ");
     }
     System.out.println();
   }

  
}

     static void change(int[] arr) {
       arr[2] = 98;
     }
    
}