import java.util.*;

public class Withdrawl {

    public static void main (final String[] args) {

        int Account = 1000;

        final Scanner ine = new Scanner(System.in);

        System.out.println("Enter your Withdrawl amount: ");

        final String Withdrawl = ine.nextLine();

        final int v = Integer.parseInt(Withdrawl);
        
        if (v > Account){
            System.out.print("Withdrawl cannot be more than account balence");
        }else{
            Account = Account - v;

            System.out.print("Your new account balence is: " + Account );
        }

    

        ine.close();
    }
}




 