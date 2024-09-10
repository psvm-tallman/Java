package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int[] arr = new int[5];
//       arr[0] = 23;
//       arr[1] = 45;
//       arr[2] = 55;
//       arr[3] = 85;
//       arr[4] = 40;
//
//       System.out.println(arr);
//      1)
//        System.out.println(Arrays.toString(arr));
//
//       //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= in.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//
//        for (int num : arr){
//            System.out.println(num + " ");
//        }

        //array of objects
        String[] str = new String[4];
        for (int i= 0; i <str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));



    }
}
