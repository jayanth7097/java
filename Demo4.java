import java.util.*;
public class Demo4 {
public static void main(String[] args){
    int n=4;
    int m=6;
   for(int j=0;j<4;j++){
    for(int i=0;i<5;i++){
    System.out.print("*");
    } 
    System.out.println();
    }

    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
    }
    for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
    }
    
    for(int i=1;i<=n;i++){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
            }
       System.out.println();
    }

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++){
        System.out.print(j);
        }
        System.out.println();
    }
    for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
   int number =1;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
}
