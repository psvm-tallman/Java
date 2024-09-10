package Basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        random(2,4,5,6,67,7,7,8); //stores them in array of type array.
        multiple(2,3,"Mehul Uttam");

    }

    static void multiple(int a, int b, String ...v){

    }

    static void random (int ...v){      //variable length argument -> creates an array of type int.
        System.out.println(Arrays.toString(v));
    }
}
