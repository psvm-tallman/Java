package Basics;

public class Scope {
    public static void main(String[] args) {
        int num1 = 10;

        {
//            int num1 = 78; //block scoping - cannot initialise same variable again, but it is modifiable
            num1 = 90; //modifiable
            int c = 80;
        }
//        System.out.println(c); //values initialised in the block will remain inside the scope of that block - cannot use outside the block.
        System.out.println(num1);
    }

    static void number(){
        int num = 100;
//        System.out.println(num1); //cannot access because it is outside of number function - function scoping.
    }
}
