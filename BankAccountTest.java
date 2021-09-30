public class BankAccountTest{
    public static void main(String[] args){
        // $$$$$$$$$$ TEST CODE $$$$$$$$$$
        BankAccount one = new BankAccount("John", 55.00, 100.00);

        one.displayAccount();
        one.checkingDeposit(100.00);
        one.savingsDeposit(100.00);
        one.checkingWithdraw(100.00);
        one.savingsWithdraw(100.00);
        System.out.println(one.gettotalAccounts());
        System.out.println(one.getTotalMoneyInAccounts());
    }
}