import java.io.File;
import java.util.Scanner;

import controller.*;

class LockerApp{
  public static void main(String... arg) {
    String key="";
    Scanner input = new Scanner(System.in);
    try{
      Thread createFolder = new Thread(new Runnable(){
        @Override
        public void run(){
          InitStorage();
        }
      });
      createFolder.start();
      createFolder.join();
      }
      catch(InterruptedException e){
          e.printStackTrace();
      }
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
  private static void InitStorage(){
    File f = new File("./filestorage/");
    if (f.exists() && f.isDirectory()) {
      return;
    }
    else {
      File f1 = new File("./filestorage/");  
      boolean bool = f1.mkdir();  
      if(bool){  
         System.out.println("Storage initiated successfully");  
      }else{  
         System.out.println("Error Found!");  
      }
    }
  }
}