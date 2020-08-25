

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

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


}
