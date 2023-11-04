package javaClass3;
// Declare multidimensional array and store 5 countries and their capital and print them in console.
public class Que3 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1(){
        // Declare the multidemension Array
        String [][] ccName = {{"India" , "Pakistan" ,"England", "Shrilanka" ,"Bangladesh"},
                              {"Delhi", "Islamabad", "London", "Colombo","Dhaka" }};


        System.out.println(" County Name - "  + ccName[0][0]   +   " , Capital name - " + (ccName[1][0]) ); // print the country & capital name
        System.out.println(" County Name - "  + ccName[0][1]   +   " , Capital name - " + (ccName[1][1]));
        System.out.println(" County Name - "  + ccName[0][2]   +   " , Capital name - " + (ccName[1][2]));
        System.out.println(" County Name - "  + ccName[0][3]   +   " , Capital name - " + (ccName[1][3]));
        System.out.println(" County Name - "  + ccName[0][4]   +   " , Capital name - "  + (ccName[1][4]));


    }
}
