import java. util.* ;

class Calculator {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
    
}

 class AdvanceCalculator extends Calculator{
    int add(int a,int b){     // OVERRIDE
        return a + b;
    }

    double add(double a, double b){       //OVERRIDE
        return a + b; 
    }
}

public class  AvdCalculator {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    AdvanceCalculator advCalc = new AdvanceCalculator();

    //INPUT
    System.out.print("Enter 2 Integers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.print("Enter 3 Integers: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    
    System.out.print("Enter 3 Double Numbers: ");
    double d1 = sc.nextDouble();
    double d2 = sc.nextDouble();

    //OUTPUT
    System.out.println("Calculator(2 int) = " + calc.add(a,b));
    System.out.println("Calculator (3 int) = " + calc.add(x,y,z));
    System.out.println("Calculator(Double) = " + calc.add(d1,d2));

    System.out.println("AdvanceCalculator (2 int) = " + advCalc.add(a,b));
    System.out.println("AdvanceCalculator (double) = " + advCalc.add(d1,d2));
 
    sc.close();

           }
}

