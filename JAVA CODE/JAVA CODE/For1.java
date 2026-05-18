package Loops;
 public class For1{

     public static void main (String[] args ){
       int count=0;
     
       for (int i = 1; i<=50; i++) {
         System.out.println(i);
      
      if(i%5==0){
         System.out.println("True");
         count++;
      }
           else{
         System.out.println("False");
      
      }
      System.out.println(count);
     
   }
      System.out.println(count);
   }
 }
