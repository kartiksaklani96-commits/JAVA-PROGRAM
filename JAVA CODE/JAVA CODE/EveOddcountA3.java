// Q11: Even-Odd Digit Count
// Count how many even and odd digits

public class EveOddcountA3{
    public static void main(String[] args) {
        int number = 123456789;
        
        int evencoount = 0;
        int oddcount = 0;

        while(number >0){
            int digit = number % 10;
            
            if (digit % 2 == 0){
                evencoount++;
            }
            else{
                oddcount++;
            }

            number = number /10;
        }

        System.out.println("Even digit count = " + evencoount);
        System.out.println("Odd digit count = " + oddcount);
    }
}