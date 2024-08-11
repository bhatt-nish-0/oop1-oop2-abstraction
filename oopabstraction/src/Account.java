public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //java will thus not create an empty constructor.
    public Account() {
        this("167",889,"nishbnish","2@2.com","90601430");
        //constructor chaining.
        System.out.println("constructor was called");

    }



    //constructor overloading.
    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("own constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        //System.out.println();
        this("99999",10555,customerName,customerEmail,customerPhone);

        System.out.println("called another constructor!!!!!");
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
