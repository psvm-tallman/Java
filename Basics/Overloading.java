package Basics;

public class Overloading {
    public static void main(String[] args) {
        fun(20);
        fun("Mehul");

    }

    static void fun(int a){
        System.out.println(a);

    }

    static void fun(String a){
        System.out.println(a);
    }
}
