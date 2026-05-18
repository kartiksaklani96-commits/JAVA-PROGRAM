public class NumberPatternA3 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= i; j++) {    // numbers in each row
                System.out.print(j + " ");
            }
            System.out.println();             // move to next line
        }
    }
}