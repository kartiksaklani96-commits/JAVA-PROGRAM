package Loops;
import java .util.*;

public class PrintDigits{
       public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
            count++;
        }
        System.out.println("\n"+"count is:"+ count);
        sc.close();
     }
    
}
