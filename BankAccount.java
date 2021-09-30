public class BankAccount{
    // Create attributes for bank account class
    private String AccountHolder;
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts = 0;
    private static double totalMoneyInAccounts = 0.0;

    //Overload the BankAccount class
    public BankAccount() {}; 


    // Create an instance of an account
    public BankAccount(String accountHolder, double checkingBalance, double savingsBalance){
        this.AccountHolder = accountHolder;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAccounts++;
        totalMoneyInAccounts += checkingBalance + savingsBalance;
    }

    //Getter for Account Holder
    public String getAccountHolder(){
        return AccountHolder;
    }
    //Setter for Account Holder
    public void setAccountHolder(String setAccountOwner){
        this.AccountHolder = setAccountOwner;
    }

    // Getter for checking balance
    public double getCheckingBalance(){
        return checkingBalance;
    }
    // Setter for checking balance
    public void setCheckingBalance(double setCheckBalance){
        this.checkingBalance = setCheckBalance;
    }

    // Getter for savings balance
    public double getSavingBalance(){
        return savingsBalance;
    }
    // Setter for savings balance
    public void setSavingBalance(double setSaveBalance){
        this.savingsBalance = setSaveBalance;
    }

    // Create checkings deposit method
    public void checkingDeposit(double deposit){
        this.checkingBalance += deposit;
        System.out.println("You have deposited: " + deposit + " into your checking account!");
        System.out.println("Your new checking balance is: " + getCheckingBalance());
        totalMoneyInAccounts += deposit;
    }
    // Create savings deposit method
    public void savingsDeposit(double deposit){
        this.savingsBalance += deposit;
        System.out.println("You have deposited: " + deposit + " into your savings account!");
        System.out.println("Your new savings balance is: " + getSavingBalance());
        totalMoneyInAccounts += deposit;
    }

    // Create checking withdrawal method
    public void checkingWithdraw(double withdraw){
        if(this.checkingBalance - withdraw < 0){
            System.out.println("You do not have enough money in your checking account to withdraw!");
        }
        else{
            this.checkingBalance -= withdraw;
            System.out.println("You have withdrew: " + withdraw + " from your checking account!");
            System.out.println("Your new checking balance is: " + getCheckingBalance());
        }
        this.totalMoneyInAccounts -= withdraw;
    }

    // Create savings withdrawal method
    public void savingsWithdraw(double withdraw){
        if(this.savingsBalance - withdraw < 0){
            System.out.println("You do not have enough money in your savings account to withdraw!");
        }
        else{
            this.savingsBalance -= withdraw;
            System.out.println("You have withdrew: " + withdraw + " from your savings account!");
            System.out.println("Your new savings balance is: " + getSavingBalance());
        }
        this.totalMoneyInAccounts -= withdraw;
    }

    // Display Account Info method
    public void displayAccount(){
        System.out.println("Welcome Account " + getAccountHolder()+ "!\n" + "Your checking balance is: " + getCheckingBalance() + "\n" + "Your Savings balance is: " + getSavingBalance());
    }

    // Getter for totalAccounts
    public int gettotalAccounts(){
        return totalAccounts;
    }

    // Getter for total Money in Accounts
    public double getTotalMoneyInAccounts(){
        System.out.println("Total Money in accounts: ");
        return totalMoneyInAccounts;
    }

}