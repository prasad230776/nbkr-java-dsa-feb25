class LowBalanceExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ram", 10000);
        System.out.println(account);
        boolean status = false;
        try{
            status = account.withdraw(12000);
        }catch(LowBalanceException exception){
            System.out.println(exception.getMessage());
        }
        if(status){
            System.out.println("Transactoion successful..present details..");
            System.out.println(account);
        }

    }
}

class LowBalanceException extends Exception{
    LowBalanceException(String msg){
        super(msg);
    }
}

class BankAccount{
    String name;
    double balance;
    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
    }
    boolean withdraw(double amount) throws LowBalanceException{
        if(amount > balance){
            throw new LowBalanceException("Insufficient Balance.. try with lesser amount");
        }
        balance-= amount;
        return true;
    }
    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", balance=" + balance + "]";
    }
    
}
