package javaClass3;

import java.util.Scanner;

// Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to their symbol(using if else)
public class Que13 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number = a ");
        int a = sc.nextInt();
        System.out.println(" Enter the second number = b ");
        int b = sc.nextInt();
        System.out.println(" Enter the mathematics operator ");
        String operator = sc.next();
        if (operator.equals("+")) {
            System.out.println("Addition  = " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println("Subtraction = " + (a - b));
        } else if (operator.equals("*")) {
            System.out.println("Multiplication = " + (a * b));
        } else if (operator.equals("/")) {
            System.out.println("Divison = " + (a / b));
        } else {
            //System.out.println();
        }
    }
}

