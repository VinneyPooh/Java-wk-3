package javaClass3;

// Write a java program to get numbers from users and print whether it is positive or negative.( use switch statement)

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
    m1();
    }
    public static void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any alphabet from A to F ");
        String cityName = sc.next();
        switch (cityName) {
            case "A":
                System.out.println("Ahemdabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chittaurgadh");
                break;
            case "D":
                System.out.println("Deesa");
                break;
            case "E":
                System.out.println("Eluru");
                break;
            case "F":
                System.out.println("Fatepur");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
