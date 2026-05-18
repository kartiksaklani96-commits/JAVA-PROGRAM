package Loops;

public class Specialnumbercounter {
    public static void main(String[] args) {
        int n= 10,count=0;
         for(int i=1;i<=n;i++){
              System.out.print(i + " ");
            if (i%2==0 && i%3!=0) {
              count++;
            }
        }
        System.out.println("\n"+"count is:"+count);
         }
    }
    

