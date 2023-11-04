package javaClass3;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
public class Que19 {

    public static void main(String[] args) {
        m1();

    }
    public static void m1(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number = ");
        int num= sc.nextInt();
        if (num>0){
            System.out.println(" POSITIVE ");
        } else if (num<0) {
            System.out.println(" NEGATIVE ");
        } else if (num == 0) {
            System.out.println(" ZERO ");
        }else{
            System.out.println();
        }

    }
}

