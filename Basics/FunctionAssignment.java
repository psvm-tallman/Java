package Basics;

import java.util.Scanner;

public class FunctionAssignment {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = in.nextInt();
        Max(num1, num2, num3);
        Min(num1, num2, num3);
        
    }

    //Function to take the user Basics.input.
    public  static void Max(int num1, int num2, int num3){
       if(num1>num2 && num1>num3){
        System.out.println("Largest Number: "+num1);
       } else if(num2>num1 && num2>num3){
        System.out.println("Largest Number: "+num2);
       }else{
        System.out.println("Largest Number: "+num3);
       }
    }

    static void Min(int num1,int num2,int num3){
        if(num1<num2 && num1<num3){
            System.out.println("Smallest Number: "+num1);
           } else if(num2<num1 && num2<num3){
            System.out.println("Smallest Number: "+num2);
           }else{
            System.out.println("Smallest Number: "+num3);
           }

    }

}
