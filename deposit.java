import java.util.*;

public class deposit {


    public static void main (String[] args){
    }

    public void depositMoney (Scanner myScanner)    {

        try {

            Account myAccount;

            int Account = myAccount.getAccount();
                

        System.out.println("Enter your Deposit amount: ");
  
        String deposit = myScanner.nextLine();
  
        int z = Integer.parseInt(deposit);

        
         Account = Account + z;

         BankBalance myBankBalance = new  BankBalance();

            myBankBalance.Writefile(Account);
        

         System.out.print("Your new account balence is: " ); 


            myBankBalance.Readfile();
        

         
        }
        catch (Exception e) {

            System.out.println("Error: " + e.getMessage() );
        }

        
        
    }
    
      }
    
    

