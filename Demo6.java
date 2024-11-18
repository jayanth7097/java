import java.util.*;
public class Demo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int number[]= new int[size];
        System.out.println("Enter the values of array");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the number to find");
        int x =sc.nextInt();
        
        for(int j=0;j<size;j++){
            if(number[j] == x){
                System.out.println(j);
                return;
            }
        }
       System.out.println("not found");
       return;
    }
}
