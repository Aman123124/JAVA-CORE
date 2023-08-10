public class AccountNumber {
    // Instance members
    private String accountNumber;
    private String customerName;
    private double balance;

    // Static variable
    private static double rateOfInterest = 0.05; // Example interest rate (5%)

    // Setter methods
    public void setAccountNo(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRateOfInterest(double rate) {
        rateOfInterest = rate;
    }

    // Getter methods
    public String getAccountNo() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Calculate Simple Interest
    public double calcSimpleInterest(double time) {
        return balance * rateOfInterest * time;
    }

    public static void main(String[] args) {
        // Create instance of AccountNumber class
        AccountNumber account1 = new AccountNumber();
        AccountNumber account2 = new AccountNumber();

        // Set values using setter methods
        account1.setAccountNo("1234567890");
        account1.setCustomerName("John Doe");
        account1.setBalance(1000);

        account2.setAccountNo("9876543210");
        account2.setCustomerName("Jane Smith");
        account2.setBalance(5000);

        // Display account information
        System.out.println("Account Number: " + account1.getAccountNo());
        System.out.println("Customer Name: " + account1.getCustomerName());
        System.out.println("Balance: " + account1.getBalance());

        // Calculate and display interest for account1
        double interest1 = account1.calcSimpleInterest(1.5);
        System.out.println("Interest for account1: " + interest1);

        // Changing the static rate of interest
        AccountNumber.setRateOfInterest(0.06); // New interest rate (6%)

        // Calculate and display interest for account2
        double interest2 = account2.calcSimpleInterest(2.0);
        System.out.println("Interest for account2: " + interest2);
    }
}
