package javaClass3;

import java.util.Scanner;

// Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.
public class Que11 {
    public static void main(String[] args) {
       m1();
    }
    public static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any alphabet from A to F ");
        String cityName = sc.next();
    if(cityName.equals("A") || cityName.equals("a")){ // another method is ".equalignore"
        System.out.println("Ahemdabad");
    }
    else if (cityName.equals("B") || cityName.equals("b")){
        System.out.println("Baroda");
    }
    else if (cityName.equals("C") || cityName.equals("c")) {
        System.out.println("Chandigardh");
    }
    else if(cityName.equals("D") || cityName.equals("d")){
        System.out.println("Dehli");

    } else if(cityName.equals("E") || cityName.equals("e")){
        System.out.println("Esanpur");
    } else if (cityName.equals("F") || cityName.equals("f")){
        System.out.println("Faridabad");
    }
    else {
        System.out.println("Invalid Entry");
    }
    }


}

