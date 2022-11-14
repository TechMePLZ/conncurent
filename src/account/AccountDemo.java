package account;

public class AccountDemo {
    public static void main(String[] args) throws InterruptedException {
        Account accountFrom = new Account(20000);
        Account accountTo = new Account(20000);

        AccountThread accountThread1 = new AccountThread(accountFrom, accountTo);
        AccountThread accountThread2 = new AccountThread(accountTo, accountFrom);

        accountThread1.start();
        accountThread2.start();

        accountThread1.join();
        accountThread2.join();

        System.out.println(accountFrom);
        System.out.println(accountTo);


    }
}
