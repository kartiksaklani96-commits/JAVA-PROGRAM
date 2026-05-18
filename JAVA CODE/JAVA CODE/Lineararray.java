import java.util.Scanner;

public class Lineararray {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int array[] = new int [n];

        for (int i = 0; i<n; i++){
        System.out.println("Enter elements: ");
        array[i] = sc.nextInt();
        
        }
        System.out.println("Arrays element are as following: ");
        


        for(int i=0; i<n; i++){
        System.out.println(array[i]);
        }
        

    sc.close();



    }
}
