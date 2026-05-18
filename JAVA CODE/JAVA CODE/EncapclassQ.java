class Account {
    // Variable
    private double balance;

    // Method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }
}

public class EncapclassQ {
    public static void main(String[] args) {
        // Create object of Account
        Account acc = new Account();

        // Set balance
        acc.setBalance(5000);

        // Display balance
        System.out.println("Balance is: " + acc.getBalance());
    }
}
