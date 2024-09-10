package Basics;

public class shadowing {
    static int x = 90; //global scope

    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 100; //local scope - the class variable at line 4 is shadowed by this
        System.out.println(x); //100 -> scope will begin when value is initialised
    }
}
