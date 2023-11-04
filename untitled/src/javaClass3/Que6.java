package javaClass3;

import java.util.Scanner;

// WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
public class Que6 {


    public static void main(String[] args) {
    m1();
    }
    public static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Employee id - ");
        int id = sc.nextInt();
        System.out.println(" Enter the Employee name - ");
        String name = sc.next();
        System.out.println(" Enter the Basic salary - ");
        int basicSalary = sc.nextInt();
        double HRA = basicSalary*0.1;
        double DA  = basicSalary*0.08;
        double TA  = basicSalary*0.09;
        double PF  = basicSalary*0.2;
        double GrossSalary = basicSalary+HRA+DA+TA-PF;

        System.out.println("|                                   |");
        System.out.println("|        salary slip                |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   Employee id : " + id +       " |");
        System.out.println("| Employee name : " + name +    "  |");
        System.out.println("|                                   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Basic Salary : " + basicSalary +"|");
        System.out.println("|  HRA 10% :       " + HRA +           "|");
        System.out.println("|   DA 8%  :       " + DA  +           "|");
        System.out.println("|   TA 9%  :       " + TA  +           "|");
        System.out.println("|   PF 20% :       " + PF  +           "|");
        System.out.println("|   Gross salary : " + GrossSalary  +  "|");
        System.out.println("|                                       |");



    }
}
