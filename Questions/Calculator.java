package Questions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
       do {
            System.out.print("Enter your Operation: ");
            Scanner in = new Scanner(System.in);
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
            System.out.print("Enter First Number: ");
            int num1 = in.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = in.nextInt();

                if (ch == '+') {
                    System.out.println("Result: " + (num1 + num2));
                } else if (ch == '-') {
                    System.out.println("Result: " + (num1 - num2));
            }
                 else if (ch == '*') {
                    System.out.println("Result: " + (num1 * num2));
            }
                 else if (ch == '/') {
                    System.out.println("Result: " + (num1 / num2));
            }

            } else if (ch == 'x') {
                break;
            }else{
                System.out.println("Please Enter a valid Operation to continue.");
            }
        }
        while (true); // Use the defined con here
        
    }
}
