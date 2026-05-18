package Loops;

public class Sumofdigits {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;//here we use "*=" for product of the digits and sum=1.
        }
         System.out.println("\n"+"sum of natural number is:"+sum);
       
    }
      
    
}
