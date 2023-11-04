package javaClass3;
// Write if else condition and print your group name in console else others group name.
public class Que4 {
   static String groupName ="Code2";

    public static void main(String[] args) {
    m1();
    }
    public static void m1 (){
        if (groupName.contains("Code2") ){
            System.out.println(groupName);
        }
    else{
            System.out.println(" other groups- Agile");
        }
    }
}
