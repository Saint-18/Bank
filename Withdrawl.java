import java.util.*;

public class Withdrawl {

    public static void main (String[] args) {
    }
    public void WithdrawlMoney (Scanner myScanner)    {

        Account myAccount = new Account();

        int Account = myAccount.getAccount();
        

        System.out.println("Enter your Withdrawl amount: ");

        String Withdrawl = myScanner.nextLine();

        int v = Integer.parseInt(Withdrawl);

        
        if (v > Account){

            System.out.print("Withdrawl cannot be more than account balence");

        }else{

            Account = Account - v;


            BankBalance myBankBalance = new  BankBalance();

            myBankBalance.Writefile(Account);


            System.out.print("Your new account balence is: " );
           
            myBankBalance.Readfile();
        }

    
       
        
    }
}




 