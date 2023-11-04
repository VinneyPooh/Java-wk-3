package javaClass3;

import java.util.Scanner;

// Write a java program to input any number and find out if it’s odd or even.
public class Que7 {
    // create a main method
    public static void main(String[] args) {
    m1();
    }
    // create a static method
    public static void m1(){
        Scanner sc= new Scanner(System.in); // call scanner object
        System.out.println("Enter the number -");
        int num = sc.nextInt(); // call the variable via java library
        // logic for even odd numbers , using if-else
        if (num%2==0){
            System.out.println(" The number is Even ");
        }else {
            System.out.println(" The number is Odd");
        }
    }

}
