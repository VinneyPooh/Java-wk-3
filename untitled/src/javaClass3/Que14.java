package javaClass3;
// Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
public class Que14 {
    public static void main(String[] args) {
        m1();
        m2();
    }

    public static void m1() {
        int i;
        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0){
                System.out.print(" " + i );

            }
        }
    }
    public static void m2() {
        int i;
        for (i = 1; i <= 100; i++) {

            if (i % 5 == 0){
                System.out.print("\n "  + i);

            }
        }
    }
}