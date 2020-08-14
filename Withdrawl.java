import java.util.*;

public class Withdrawl {

    public static void main (String[] args){
 
     int Account = 1000;

    Scanner ine = new Scanner(System.in);

    System.out.println("Enter your Withdrawl amount: ");

    String Withdrawl = ine.nextLine();

    int v = Integer.parseInt(Withdrawl);
        if ( v > 0) {

    Account = Account - v;

    System.out.print("Your new account balence is: " + Account );
        }

    ine.close();
    }
}