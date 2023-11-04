package javaClass3;

import java.util.Scanner;

//Write a java program that tells us that Input number is odd or even? HINT: use ternary operator (? :)
public class Que1 {

    public static void main(String[] args) { // main method
       m1();
       m2();

    }
    // static method
    public static void m1() {
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Enter a number - ");
        int num = sc.nextInt(); // using variable which take the input as scanner
        if (num % 2 == 0) { // even odd  logic condition
            System.out.println(" the number is Even");
        } else
            System.out.println(" the number is Odd");
    }
    public  static void m2(){
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Enter a number - ");
        int num = sc.nextInt(); // using variable which take the input as scanner

        System.out.println("Enter a number - ");
        String result = (num % 2 == 0)?  " Even number. "  :  "Odd number.  ";  // use tenary operator
        System.out.println(result); // print output.
    }
}
