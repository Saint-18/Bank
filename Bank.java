import java.util.*;
import java.io.File;
import java.io.IOException;

public class Bank {
    
    public static void main (String[] args) {     //intro access
      
     
      

       

      Scanner in = new Scanner(System.in);

      System.out.println("Enter your 4 digit pin: ");

      String pin = in.nextLine();

      int x = Integer.parseInt(pin);

      if(x == 1107){ //pin number                      //post access code
        System.out.println("Your account has been accessed");

        System.out.println(" ");

        System.out.println("For Deposit press 1.");
      
        System.out.println("For Withdrawl press 2.");

        System.out.println("If finished press 3.");

        
        System.out.println(":   ");

        
        String num = in.nextLine();
  
        int y = Integer.parseInt(num);
      
        // inq.close();

        if(y == 1){                            //deposit code

        
         
         
         
         // String[] alpha = new String[1];
         
         deposit myDeposit = new deposit();

         myDeposit.depositMoney(in);

        



        }else if(y == 2){                       //withdrawl code
            
         
                
        

          Withdrawl myWithdrawl = new Withdrawl();

         myWithdrawl.WithdrawlMoney(in);
 
          

 


        }
                                             //post interaction code

        
  
    try {

      File myObj = new File("filename.txt");

      if (myObj.createNewFile()) {

        System.out.println("File created: " + myObj.getName());
      } else {

        System.out.println("File already exists.");
      }

    } catch (IOException e) {

      System.out.println("An error occurred.");
      
      e.printStackTrace();
    
  
}
          


      }
      
      in.close();
      
      
     
    }
   
}