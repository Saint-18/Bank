import java.util.*;

public class deposit {


    public static void main (String[] args){

       int Account = 1000;

        Scanner inw = new Scanner(System.in);

        System.out.println("Enter your Deposit amount: ");

        
  
        String deposit = inw.nextLine();
  
        int z = Integer.parseInt(deposit);

         Account = Account + z;

         System.out.print("Your new account balence is: " + Account );

        inw.close();
    }
    
}
