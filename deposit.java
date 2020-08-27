import java.util.*;

public class deposit {

    public static void main(String[] args) {
    }

    public void depositMoney(Scanner myScanner) {

        try {

            BankBalance bb = new BankBalance();
            int Account = bb.Readfile();

            System.out.println("Enter your Deposit amount: ");

            String deposit = myScanner.nextLine();

            int z = Integer.parseInt(deposit);

            Account = Account + z;

            bb.Writefile(Account);

            System.out.print("Your new account balence is: ");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
