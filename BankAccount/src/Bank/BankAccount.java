package Bank;

public class BankAccount {
    private int accountNumber;
    protected String type;
    private String owner;
    private float balance;
    private Boolean status;

    public void openAccount(){
        this.setStatus(true);
        System.out.println("Successfully opened the account.");
        System.out.println("Account " + getAccountNumber() + " has been opened.");

        if (this.getType().equals("C.A")){
            this.setBalance(getBalance() + 50);
            System.out.println("Bonus balance: " + getBalance());
        }
        if (this.getType().equals("S.A"))
        {
            this.setBalance(getBalance() + 150);
            System.out.println("Bonus balance: " + getBalance());
        }
    }
    public void closeAccount(){
        if (getBalance() >= 0){
            setStatus(false);
            System.out.println("The account has been closed.");
        }
        else {
            System.out.println("You must pay the outstanding balance.");
        }
    }
    public void deposit(float amount){
        setBalance(getBalance() + amount);
        System.out.println("You have deposited " + amount + " to the account.");

    }
    public void checkAccount(String owner){
        if (owner.equals(getOwner())){
            if (getStatus().equals(false)) {
                System.out.println("Status - Account is open: " + getStatus());
            }
            else {
                System.out.println("The account number: " + this.getAccountNumber());
                System.out.println("Owner: " + getOwner());
                System.out.println("type: " + getType());
                System.out.println("The account has: " + getBalance() + "$");
                System.out.println("Status - Account is open: " + getStatus());}
        }
        else {
            System.out.println("The account don't exist.");
        }
    }
    public void withDraw(float amount){
        if (amount > getBalance()){
            System.out.println("You do not have enough money.");
            System.out.println("But it's not a problem");
            setBalance(getBalance() - amount);
        }
        else {
            setBalance(getBalance() - amount);
        }
    }
    public void monthlyPayment(){
        if (this.getType().equals("C.A")){
            this.setBalance(this.getBalance() - 12);
        }
        if (this.getType().equals("S.A")){
            this.setBalance(this.getBalance() - 20);
        }
    }


    public BankAccount(String type, String owner) {

        if(type.equals("Savings account")) {
            setType("S.A");
            setOwner(owner);
        }
        else if(type.equals("Checking account")) {
            setType("C.A");
            setOwner(owner);
        }
        else {
            System.out.println("The account type is invalid.");
            System.out.println("Choose between: Savings account and Checking account.");
            System.exit(0);
        }

        setAccountNumber((int)(Math.random() * (99) + 1));
        System.out.println("Your account number is " + getAccountNumber());
        setBalance(0.0f);
        setStatus(false);
    }

    private int getAccountNumber() {
        return accountNumber;
    }
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    private String getType() {
        return type;
    }
    private void setType(String type) {
        this.type = type;
    }
    private String getOwner() {
        return owner;
    }
    private void setOwner(String owner) {
        this.owner = owner;}
    private float getBalance() {
        return balance;
    }
    private void setBalance(float balance) {
        this.balance = balance;
    }
    private Boolean getStatus() {
        return status;
    }
    private void setStatus(Boolean status) {
        this.status = status;
    }

}
