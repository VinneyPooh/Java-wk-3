package javaClass3;
//Write a Java program to sum values of an array.
public class Que21 {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        int [] x ={1, 2, 3, 4, 5};// define array
        int sum=0; // store the value in "sum" variable
        for (int i = 0; i < x.length; i++) { // calculate the array values
            sum = sum + x[i];
        }
        System.out.println(" print the values of array = "  + sum);
    }
}

