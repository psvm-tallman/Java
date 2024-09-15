package linear_search;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,4,55,644,33,24,3,5};
        System.out.print("Enter Target Value: ");
        int target = in.nextInt();
        Linear(arr, target);
    }

   static void Linear(int[] arr, int target){
        for (int j : arr) {
            if (j == target) {
                System.out.println("Target found: " + target);
            }
        }
    }
}
