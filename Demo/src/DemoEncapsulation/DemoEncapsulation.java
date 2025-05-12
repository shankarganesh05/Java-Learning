package DemoEncapsulation;
class Bank{
    private int balance;
    public void setBalance(int amount) {
        this.balance = amount;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

}

public class DemoEncapsulation {
    public static void main(String[] args) {
        // Encapsulation
        Bank b = new Bank();
        System.out.println("Balance: " + b.getBalance());
        b.setBalance(500);
        System.out.println("Balance After SetBalance " + b.getBalance());
        b.deposit(1000);
        System.out.println("Balance After Deposit: " + b.getBalance());
        b.withdraw(500);
        System.out.println("Balance After Withdraw: " + b.getBalance());

    }
    
}
