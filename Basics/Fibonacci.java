package Basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. That is, the sequence starts 0, 1, 1, 2, 3, 5, 8, 13, 21, and so forth. Each number in the sequence is referred to as a Fibonacci number.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <=n ; i++ ){
            int sum = a + b;
            a = b;
            b = sum;     
        }
        System.out.println("The "+ n+"th "+"term in fibonacci series is: "+ a);
        
    }
}