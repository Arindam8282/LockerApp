package usecases;

import java.io.File;

public class CreateFile {
  private File f1;
  public CreateFile(String name){
    this.f1 = new File("./filestorage/"+name);
    try {
      if (this.f1.createNewFile()) {
        System.out.println("File created Successfuly\n Name : " + this.f1.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (Exception e) {
      System.out.println("File creation failed path doesn't exist");
    }
  }
}
