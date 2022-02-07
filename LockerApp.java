import java.util.Scanner;

import controller.*;

class LockerApp{
  public static void main(String... arg) {
    String key="";
    Scanner input = new Scanner(System.in);
    Locker locker = new Locker();
    System.out.println("_______LOCKER APP_______\n   Developer Details\nName : Arindam Dutta\nEmail: darindam507@gmail.com\ncontact : 8282826909\nGitHub : Arindam8282\nSource Code : https://github.com/Arindam8282/LockerApp");

    while (!key.equals("3")) {
      System.out.print("\n\tLOCKER MENU\n 1.Get All Files\n 2.Operations(Add, Delete, Search)\n 3.Close\n Enter Key - ");
      key = input.nextLine();
      switch (key) {
        case "1":
          locker.printAllFiles();
          break;
        case "2":
          locker.Operations();
          break;
        case "3":
          System.out.println("Locker Closed Successfuly");
          break;  
        default:
          System.out.println("Wrong Input!!");
          break;
      }
    }
  }
}