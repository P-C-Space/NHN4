import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;
    



    public void setData(long accountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

}

class CreateAccount {
    public static BankAccount createNewBankAccount(long accountNumber, String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();

        newAccount.setData(accountNumber, ownerName, balance);
        return newAccount;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount(0, "Vesper Lind", new BigDecimal("0.0"));
        BankAccount bankAccount2 = CreateAccount.createNewBankAccount(1, "James Bond", new BigDecimal("0.0"));
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount2.getAccountNumber());
        printBankAccount(bankAccount);
        printBankAccount(bankAccount2);
    }


    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}