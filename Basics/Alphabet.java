package Basics;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        //The `trim()` method in Java is used to remove leading and trailing whitespace characters from a string. It does not affect the original string but returns a new string where all the leading and trailing whitespaces have been removed.
        //The charAt(int index) method in Java is used to obtain the character value at the specified index within a String object. The index is zero-based, meaning the first character of the string is at index 0, the second character is at index 1, and so on. If the index is out of range (less than 0 or greater than or equal to the length of the string), it throws a StringIndexOutOfBoundsException.

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("Uppercase");
        }
    
    }
}
