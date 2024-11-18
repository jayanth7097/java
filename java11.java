import java.util.*;
public class java11 {
    public static void print(int a , int b){
        System.out.println("HEllo world");
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);


    }
    public static int mul(int a, int b){
        int mul = a*b;
        System.out.println(mul);
        return mul;
    }
    public static void main(String[] args) {
        System.out.println("jayanth");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //print(a, b);
        int c= mul(a, b);
        System.out.println(a+" "+b);
    }
    
}
