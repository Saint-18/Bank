import java.util.*;

public class Withdrawl {

    public static void main (String[] args) {
    }
    public void WithdrawlMoney (Scanner myScanner)    {

        int Account = 1000;

        

        System.out.println("Enter your Withdrawl amount: ");

        String Withdrawl = myScanner.nextLine();

        int v = Integer.parseInt(Withdrawl);
        
        if (v > Account){
            System.out.print("Withdrawl cannot be more than account balence");
        }else{
            Account = Account - v;

            BankBalance myBankBalance = new  BankBalance();

            myBankBalance.Writefile();


            System.out.print("Your new account balence is: " + Account );
        }

    
       
        
    }
}




 