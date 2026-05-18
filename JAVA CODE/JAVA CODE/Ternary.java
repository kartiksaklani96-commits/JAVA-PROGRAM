package Loops;

public class Ternary {
    public void count(int n) {
    int j=0;
    for (int i = 1; i <= n;  i++) {
      j = (i%5==0) ? j+1 : j;
    }
    System.out.println(j);
  }
    
}
