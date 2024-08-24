import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("enter what you want to buy");

        String s = scan.nextLine();

        //String buyerWants = "laptop";
        ComputerTemplate computerTemplate = null;
        if (s.equals("laptop")) {
            computerTemplate = new Laptop();
        }else if (s.equals("server")){
            computerTemplate = new Server();
        }

        try {
            computerTemplate.doOn();
        } catch (NullPointerException e) {
            System.out.println("you entered neither a laptop nor a server");
        }
    }
}
