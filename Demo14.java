public class Demo14 {
    
    public static int printsum(int n, int sum) {
        if (n == 0) {
            return sum; 
        }
        sum *= n; 
        System.out.println(sum); 
       return  printsum(n - 1, sum); 
        
        
    }

    public static void main(String[] args) {
        int i = 5;
        int n = 1;

    
        int m = printsum(i, n);
        System.out.println(m);  
    }
}
