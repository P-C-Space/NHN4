package nhn20230905;

public class Test {
    public static void main(String[] args) {
        // Movie oppi = new Movie();
        // oppi.script = 10;
        // oppi.acting = 9;
        // oppi.direction = 10;

        // System.out.println(oppi.rating());

        // Movie con = new Movie();
        // con.script = 9;
        // con.acting = 8;
        // con.direction = 6;

        // System.out.println(con.rating());

        BankAccount account = new BankAccount();
        BankAccount.accountNumber = 103;
        account.balance = 100;
        account.ownerName = "Celine";

                BankAccount account2 = new BankAccount();
        BankAccount.accountNumber = 104;
        account2.balance = 100;
        account2.ownerName = "Celine";

        System.out.println(BankAccount.accountNumber);

        Balance b1 = new Balance(10);
        Balance b2 = new Balance(5);

        b1 = b1.add(b2);
    }
}
