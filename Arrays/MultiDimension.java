package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr2D = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}

        int[][] arr = new int[3][3];


        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        //1)
//        for (int row = 0; row <arr.length ; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
        //2)
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

        //3)
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
