package javaClass3;

import java.util.Scanner;

// Write a java program to get numbers from users and print whether it is positive or negative.
public class Que8 {
    public static void main(String[] args) {
     m1();
    }
    public static void m1(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number - ");
        int num = sc.nextInt();
        if (num>=0){
            System.out.println(" Positive number ");
        }else {
            System.out.println(" Negative number ");
        }
    }
}
