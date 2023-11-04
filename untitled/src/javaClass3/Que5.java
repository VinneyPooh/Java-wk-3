package javaClass3;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/


import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the student name ");
        String name= sc.nextLine();
        System.out.println(" Enter the roll number ");
        int num = sc.nextInt();
        System.out.println(" Enter the marks of Maths ");
        int marksM= sc.nextInt();
        if (marksM>=0 && marksM<=100){
            System.out.println("next");
        }else {
            System.out.println("Enter valid marks between 0 t0 100");
        }

        System.out.println(" Enter the marks of Science ");
        int marksS= sc.nextInt();
        if (marksS>=0 && marksS<=100){
            System.out.println("next");
        }else {
            System.out.println("Enter valid marks between 0 t0 100");
        }

        System.out.println(" Enter the marks of English ");
        int marksE= sc.nextInt();
        if (marksE>=0 && marksE<=100){
            System.out.println("next");
        }else {
            System.out.println("Enter valid marks between 0 t0 100");
        }
        double total=marksE+marksM+marksS;
        double percentage= (total/300)*100;
        System.out.println("Total = " +total);
        System.out.println("Percentage = " + percentage);

        if((percentage>=35))
        {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        if (percentage>=80){
            System.out.println("Grade A+");
        } else if(percentage>=60){
            System.out.println("Grade A");
        } else if(percentage>=50) {
            System.out.println("Grade B");
        } else if (percentage>=35) {
            System.out.println("Grade C");
        } else {
            System.out.println("marksheet");
        }
            System.out.println("|-----------------------------------------|");
            System.out.println("|                marksheet                |");
            System.out.println("|                                         |");
            System.out.println("|   Name        :"   + name +      "      |");
            System.out.println("|   Roll number :"   + num  +      "      |");
            System.out.println("|                                         |");
            System.out.println("|   Subject       :       Marks           |");
            System.out.println("|   Maths marks   :" +marksM+           " |");
            System.out.println("|   Science marks :" +marksS+           " |");
            System.out.println("|   English marks :" +marksE+           " |");
            System.out.println("|                                         |");
            System.out.println("|   Total marks :" +total+              " |");
            System.out.println("|                                         |");
            System.out.println("|   Percentage :" +percentage+          " |");
            System.out.println("|   Result :                              |");
            System.out.println("|    Grade :                              |");
            System.out.println("|-----------------------------------------|");


        }




        }




