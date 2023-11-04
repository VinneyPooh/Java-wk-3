package javaClass3;
// Write a Java program to calculate the average value of array elements.
public class Que22 {
    public static void main(String[] args) {
average();
    }
    public static void average(){
        int [] x ={1, 2, 3, 4, 5};// define array
        int sum = 0; //  store the value in "sum" variable
        int count = x.length; // define denominator for average function
        for (int i = 0; i < x.length; i++) { // calculate the array values
            sum = sum + x[i];
        }
        int avg = (sum/ x.length);// calculate the average of the array
        System.out.println(" print the average values of array = "  + avg);
    }
}
