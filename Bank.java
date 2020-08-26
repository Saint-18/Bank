import java.util.*;

public class Bank {

  public static void main(String[] args) { // intro access

    

    Scanner in = new Scanner(System.in);

    System.out.println("Enter your 4 digit pin: ");

    String pin = in.nextLine();

    int x = Integer.parseInt(pin);


    if (x != 1107) { // pin number //post access code
      in.close();
      return;
    }
      

      System.out.println("Your account has been accessed");

      BankBalance myBankBalance = new  BankBalance();

         myBankBalance.CreateFile();

      

      for (int z = 0; z < 3; z++) {

        System.out.println("");

      System.out.println("For Deposit press 1.");

      System.out.println("For Withdrawl press 2.");

      System.out.println("If finished press 3.");

      System.out.println(":   ");

      String num = in.nextLine();

      int y = Integer.parseInt(num);

     

      if (y == 1) {                          // deposit code

        deposit myDeposit = new deposit();

        myDeposit.depositMoney(in);


      } else if (y == 2) {                              // withdrawl code

        Withdrawl myWithdrawl = new Withdrawl();

        myWithdrawl.WithdrawlMoney(in);


      } else if (y == 3){

        in.close(); 

        return;
      }                                // post interaction code

       

    }
      

    
    }
    

  }

