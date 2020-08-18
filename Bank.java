import java.util.*;

public class Bank {
    
    public static void main (String[] args) { //intro access
      
     
      

      

      Scanner in = new Scanner(System.in);

      System.out.println("Enter your 4 digit pin: ");

      String pin = in.nextLine();

      int x = Integer.parseInt(pin);

      if(x == 5){      //post access code
        System.out.println("Your account has been accessed");

        Scanner inq = new Scanner(System.in);

        System.out.println("For Deposit press 1");

        System.out.println("For Withdrawl press 2");

        
        System.out.println(": ");

        
        String num = inq.nextLine();
  
        int y = Integer.parseInt(num);
      
        inq.close();

        if(y == 1){            //deposit code

        
         
         
         
         String[] alpha = new String[1];
          
         deposit.main(alpha);

        



        }else if(y == 2){          //withdrawl code
            
         
                
          String[] alpha = new String[1];
          
          Withdrawl.main(alpha);
 
 


        }
          


      }
      
      in.close();
      
      
     
    }
   
}