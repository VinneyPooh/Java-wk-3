package midweek;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Que4 {
    public static void main(String[] args) {
        square();

    }
    public static void square(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length ");
        System.out.println( " Enter the breadth");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        if (length==breadth){
            System.out.println("it is square");
        }else {
            System.out.println(" it is not square");
        }
    }
}
