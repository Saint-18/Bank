import java.util.*;

public class Bank {
    
    public static void main (String[] args) { //intro access
      
      int Account = 1000;

      

      

      Scanner in = new Scanner(System.in);

      System.out.println("Enter your 4 digit pin: ");

      String pin = in.nextLine();

      int x = Integer.parseInt(pin);

      if(x == 1111){      //post access code
        System.out.println("Your account has been accessed");

        System.out.println("For Deposit press 1");

        System.out.println("For Withdrawl press 2");

        Scanner inq = new Scanner(System.in);

        System.out.println(": ");

        
        String num = inq.nextLine();
  
        int y = Integer.parseInt(num);
      
        inq.close();

        if(y == 1){            //deposit code
            Scanner inw = new Scanner(System.in);

            System.out.println("Enter your Deposit amount: ");
      
            String deposit = inw.nextLine();
      
            int z = Integer.parseInt(deposit);

             Account = Account + z;

             System.out.print("Your new account balence is: " + Account );

            inw.close();
        }else if(y == 2){          //withdrawl code
            Scanner ine = new Scanner(System.in);

      System.out.println("Enter your withddrawl amount: ");

      String Withdrawl = ine.nextLine();

      int v = Integer.parseInt(Withdrawl);

      Account = Account + v;

      System.out.print("Your new account balence is: " + Account );

      ine.close();
        }
          


      }
      
      in.close();
      
      
     
    }
   
}