package midweek;

import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class Que5 {
    public static void main(String[] args) {
        gtr();

    }
    public static void gtr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1= sc.nextInt();
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        if (num1> num2 ){
            System.out.println(" Greater number is " + num1);
        } else if (num2>num1) {
            System.out.println(" Greater number is " + num2);
        } else {
            System.out.println();
        }
    }
}
