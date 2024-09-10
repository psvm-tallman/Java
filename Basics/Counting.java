package Basics;

import java.util.Scanner;


public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.print("Enter the Number to be counted: ");
        int i = in.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num%10;
            if(rem == i){
                count++;
            }
            num = num/10;
        }
        System.out.println("Total count: "+count);
            
        }
      

    }


