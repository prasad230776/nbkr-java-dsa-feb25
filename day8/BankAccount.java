public class BankAccount {
    private String name;
    private String accNumber;
    private double balance;
    public BankAccount(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public double getBalance() {
        return balance;
    }
    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }
    @Override
    public String toString() {
        String details = "Name :" + name + "\n";
        details += "Acc. No: " + accNumber +"\n";
        details += "Balance :" + balance + ".";
        return details; 
    }
    public void deposit(double amt){
        if(amt <=0){
            return;
        }
        balance += amt;
    }

    public boolean withdraw(double amt){
        if(amt > balance){
            return false;
        }
        balance -= amt;
        return true;
    }
    
}

class BanckAccountDemo{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ramana", "ABC1234", 10_000);
        System.out.println(account);
        account.deposit(500);
        account.withdraw(900);
        System.out.println(account);
    }
}
