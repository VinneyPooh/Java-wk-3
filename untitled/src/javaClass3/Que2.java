package javaClass3;
// Declare array and store any 5 countries and print them in console.
public class Que2 {
    public static void main(String[] args) {
    m1();
    }
    // create a static method & create arrays also call that arrays
    public static void m1(){
        String [] countryName = {"India" , "Pakistan" ,"England", "Shrilanka" ,"Bangladesh"};
        System.out.println(countryName[0]);
        System.out.println(countryName[1]);
        System.out.println(countryName[2]);
        System.out.println(countryName[3]);
        System.out.println(countryName[4]);

    }
}
