import java.io.File;  
import java.io.IOException; 
import java.io.FileWriter;   
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BankBalance{
  public static void main(String[] args) {
  }

  public void CreateFile(){

    try {
        File myObj = new File("c:\\temp\\myBankBalance.txt");
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

  public void Writefile(int Account){


    try {

        

      FileWriter myWriter = new FileWriter("c:\\temp\\myBankBalance.txt");

      myWriter.write ( "myBalance: " + Account );

      myWriter.close();

      System.out.println("Successfully wrote to the file.");


    } catch (IOException e) {

      System.out.println("An error occurred.");
      
      e.printStackTrace();
    }
  }

  public void Readfile(){

  try {

    File myObj = new File("c:\\temp\\myBankBalance.txt");

    Scanner myReader = new Scanner(myObj);


    while (myReader.hasNextLine()) {

      String data = myReader.nextLine();

      System.out.println(data);
    }

    myReader.close();

  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }








  }
}
