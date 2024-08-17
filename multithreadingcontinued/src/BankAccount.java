public class BankAccount {

    private double balance;

    private Object lock = new Object();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public /*synchronized*/ void deposit (double amount) {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized(lock) {
            double origBalance = balance;
            balance += amount;
            System.out.println();
            System.out.printf("STARTING BALANCE: %.0f, DEPOSIT (%.0f)" + " : NEW BALANCE = %.0f%n ", origBalance, amount, balance);
        }

    }

    public /*synchronized*/ void withdraw (double amount) {
        try {
            System.out.println("talking shit with teller!");
            Thread.sleep(7000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized(lock) {
            double origBalance = balance;
            if (amount <= balance) {
                balance -= amount;
                System.out.println();
                System.out.printf("STARTING BALANCE: %.0f, WITHDRAWAL (%.0f)" + " : NEW BALANCE = %.0f%n ", origBalance, amount, balance);
            } else {
                System.out.printf("STARTING BALANCE : %.0f, WITHDRAWAL (%.0f)" + ": INSUFFICIENT FUNDS!", origBalance, amount);
            }
        }



    }

    /*
    dont synchronize (this) because that will obtain the monitor lock for the whole object
    and other threads wont be able to access the whole object!

     */
}
