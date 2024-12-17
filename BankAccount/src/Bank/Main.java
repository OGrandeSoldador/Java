package Bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Savings account","Marcos Guilherme");
        account1.openAccount();
        account1.checkAccount("Marcos Guilherme");
        account1.deposit(20);
        account1.withDraw(50);
        account1.monthlyPayment();
        account1.withDraw(150);
        account1.monthlyPayment();
        account1.closeAccount();
        account1.checkAccount("Marcos Guilherme");
        account1.deposit(70);
        account1.closeAccount();
        account1.checkAccount("Marcos Guilherme");
        /* output

Your account number is 12
Successfully opened the account.
Account 12 has been opened.
Bonus balance: 150.0
The account number: 12
Owner: Marcos Guilherme
type: S.A
The account has: 150.0$
Status - Account is open: true
You have deposited 20.0 to the account.
You do not have enough money.
But it's not a problem
You must pay the outstanding balance.
The account number: 12
Owner: Marcos Guilherme
type: S.A
The account has: -70.0$
Status - Account is open: true
You have deposited 70.0 to the account.
The account has been closed.
The account don't exist. */
    }
}
