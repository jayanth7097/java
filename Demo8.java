import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int[][] numbers= new int[rows][colums]; 
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the number to find");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(numbers[i][j]==x){
                    System.out.println(i +" " +" "+j);
                    
                    return;
                }
            }
        }
        System.out.println("number not found");

        

    }
}
