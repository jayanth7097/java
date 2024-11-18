import java.util.*;
public class Demo12 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    int n=5;
   int pos = 2 ;
   int bitmask = 1<<pos;
   int number=0;
   if(x==0){
    number= ~bitmask & n;
    System.out.println(number);
   }else if(x==1){
    number = bitmask | n;
    System.out.println(number);
   }
    
   } 
}
