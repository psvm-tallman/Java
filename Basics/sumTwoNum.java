package Basics;

import java.util.Scanner;

public class sumTwoNum {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int num2 = input2.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of the two number is: " + sum);
    }
}
