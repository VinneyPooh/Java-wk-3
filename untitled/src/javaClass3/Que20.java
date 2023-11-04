package javaClass3;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Que20 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1() {
        //creating numeric array
        int[] narray = {2000, 2001, 2002, 2003, 2004, 2005};
        //creating string array
        String [] sarray = {"zarana","ayan","pankti","miten","sonal"};

        System.out.println("Original numeric array : " + Arrays.toString(narray));// print the original array
        System.out.println("Sorted numeric array : " + (Arrays.toString(narray)));// sorted & print array
        //sorted string array
        System.out.println("Original string array : " + Arrays.toString(sarray));
        System.out.println("Sorted string array : " + (Arrays.toString(sarray)));// sorted & print array
    }
}
