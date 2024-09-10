package Basics;

import java.util.Scanner;

public class sumFunction {
    public static void main(String[] args) {
        // int result = Sum();
        // System.out.println(result);
        // String greeting = greet();
        // System.out.println(greeting);
        
        
        //pass the value of numbers whwen you are calling in the maain - passing arguments.
        // int ans = sum2(20,30);
        // System.out.println(ans);

        //passing arguments in String.
        String personal = myGreet("Mehul");
        System.out.println(personal);


    }

    static String myGreet(String name){
        String response = "Hello my name is "+ name;
        return response;

    }

    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int Sum(){
        Scanner in = new Scanner(System.in) ;
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        
        return sum;
   
    }

    static String greet(){
        String greeting = "Above is the Result of the sum of two Integers.";
        return greeting;
    }



}
