package Loops;

public class Alternatesumseries {
    public static void main(String[] args) {
        int n =20,sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
