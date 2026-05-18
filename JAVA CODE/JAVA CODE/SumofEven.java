package Loops;
public class SumofEven {
    public static void main(String[] args) {
        int n=50,sum=0;
        for(int i=0;i<=n;i+=2){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\n"+"Sum of Even number is:"+sum);
    }
}
