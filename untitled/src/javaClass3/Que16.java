package javaClass3;
//Write a Java program which input any number between 1 to 7 and it print The Daysname MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
//import java.util.Scanner;number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner;


public class Que16 {
    public static void main(String[] args) {
      m1();
    }
    public static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Emter the number");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Week contains 1 to 7 days");
        }

    }
}
