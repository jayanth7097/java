import java.util.*;
public class Demo5 {
    public static void main(String[] args)
    {
      int[] marks = new int[10];
      marks[0]=98;
      marks[1]=96;
      marks[2]=95;
      System.out.println(marks[2]);
      for(int i=0;i<3;i++){
        System.out.println(marks[i]);
        int markss[] = {1,2,3,4,5,6};
        System.out.println(markss);
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int j=0;j<size;j++){
            number[j]=sc.nextInt();
        }
        for(int k=0;k<size;k++){
            System.out.println(number[k]);
        }
      }
    }
    
}
