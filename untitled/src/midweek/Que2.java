package midweek;
//Print multiplication table of 24, 50 and 29 using loop.
public class Que2 {
    public static void main(String[] args) {
        multi(29);
        System.out.println("---------------------");
        multi(24);
        System.out.println("----------------------");
        multi(50);
    }
    public static void multi(int x){
        int i;
        for (i=1; i<=10; i++){
            System.out.println(x + " * " + i + " = " + (x*i));
        }

    }
}
