import java.util.Random;

public class Dice {
    
    public static void main (String[] args) {

        Random r = new Random();

        Random e = new Random();

        int D = r.nextInt(5);

        int B = e.nextInt(5);

       
        
      
            System.out.println("Dice 1:");

       
            System.out.println(D + 1);
       
       
       
            System.out.println("Dice 2:");

         System.out.println(B + 1);
   
    if (D > B){
        System.out.println("Dice #1 Won!");
    }
    else if (B > D){
        System.out.println("Dice #2 Won!");
    }
    if (D == B){
        System.out.println("Dice #1 and Dice #2 tied");
    }
}
}