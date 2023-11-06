package midweek;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the screen.
public class Que1 {
    public static void main(String[] args) {
        average();
    }

    public static void average() {
        int add=0;
        int avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
             add = num+add;
             avg = add/10;
        }
        System.out.println("Average = " + avg);
    }
}