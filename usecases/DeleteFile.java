package usecases;

import java.io.File;

public class DeleteFile {
  private File f1;
    public DeleteFile(String fname) {
        this.f1 = new File("./filestorage/"+fname); 
        if (this.f1.delete()) {
            System.out.println("File deleted successfully - "+this.f1.getName());
        }
        else {
            System.out.println("FILE NOT FOUND");
        }
    }
}
