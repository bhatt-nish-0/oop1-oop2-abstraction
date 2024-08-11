public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        Account account2 = new Account("123",123,"nish","nish@gmail.com","90259922");

        System.out.println(account2.getBalance());
        System.out.println(account.getBalance());


        Account account3 = new Account("nishu","9@9.com","97349611");
        System.out.println(account3.getBalance());
    }
}
