import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a greater");
        } else{
            System.out.println("b is greater");
        }
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if(button==2) {
            System.out.println("greater");
        }else if(button==3) {
            System.out.println("smaller");
        }else{
            System.out.println("orewano");
        }
        switch (button) {
            case 1: System.out.println("jay");
                
                break;
            case 2: System.out.println("jaya");
                
                break;
            default: System.out.println("default");
                break;
        }
    }
}
