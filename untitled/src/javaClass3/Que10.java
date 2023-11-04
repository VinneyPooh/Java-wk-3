package javaClass3;

import java.util.Scanner;

// Write a java program input sales id, seller's name, sales amount, and salary basic and then
//fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
public class Que10 {
    public static void main(String[] args) {
    m1();
    }
    public static void m1(){
        float commission = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the sales Id - ");
        int id = sc.nextInt();
        System.out.println(" Enter the seller's name - ");
        String name = sc.next();
        System.out.println(" Enter the sales amount - ");
        int salesamount = sc.nextInt();
        System.out.println(" Enter the basic salary - ");
        int basicsalary = sc.nextInt();

        if (salesamount >= 50000 ){
            commission=salesamount*0.35f;
            System.out.println(commission);
        }
        else if (salesamount >= 30000){
            commission = salesamount * 0.2f;
            System.out.println(commission);
        }
        else if (salesamount >= 20000){
            commission = salesamount * 0.1f;
            System.out.println(commission);
        }
        else if (salesamount >= 10000){
            commission = salesamount * 0.05f;
            System.out.println(commission);
        }
        else if (salesamount < 10000){
            commission = salesamount * 0.02f;
            System.out.println(commission);
        }
        else{
           // System.out.println();
        }














    }
}
