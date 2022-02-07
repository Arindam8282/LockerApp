package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import models.LockerFile;
import usecases.*;

public class Locker {
  private ArrayList<LockerFile> lockerFiles;
  private File folder;
  Scanner input = new Scanner(System.in);
  Algo algo = new Algo();

  public Locker(){
    this.loadAllFiles();    
  }
  private void loadAllFiles() {
    int c = 0;
    this.folder = new File("./filestorage");
    this.lockerFiles = new ArrayList<LockerFile>();
    for (File file : folder.listFiles()) 
      if(file.isFile()) {
        lockerFiles.add(new LockerFile(file.getName(),file.getName().substring((file.getName().lastIndexOf('.')+1)) , new Date(file.lastModified()),c++));
      }
    algo.sort(lockerFiles);
  }
  public void printAllFiles(){
    this.loadAllFiles();
    if(this.lockerFiles.size() > 0)
      for(LockerFile file: this.lockerFiles) {
        System.out.println("\n Name : "+file.getName()+"\n Extension : "+file.getExtension()+"\n creationTime : "+file.getCreateTime());
      }
    else 
      System.out.println("\n Locker is Empty");
  }
  private void searchFile(){
    String fname;
    System.out.print("Enter File Name - ");
    fname = input.nextLine();
    this.loadAllFiles();
    LockerFile result = algo.binarySearch(this.lockerFiles,fname);
    if (result == null)
            System.out.println("FILE NOT FOUND");
    else
        System.out.println("FILE found at "+ result.getIndex()+"\n Name : "+result.getName()+"\n Extension : "+result.getExtension()+"\n Creation Time : "+result.getCreateTime());
  }
  private void createFile(){
    String fname;
    System.out.print("Enter File Name to add - ");
    fname = input.nextLine();
    CreateFile f1 = new CreateFile(fname);
  }
  private void deleteFile() {
    String fname;
    System.out.print("Enter File Name to delete - ");
    fname = input.nextLine();
    DeleteFile f1 = new DeleteFile(fname);
  }
  public void Operations(){
    String key="";
    while(!key.equals("4")){ 
      System.out.print("\n\tLOCKER OPERATIONS\n 1.Add File\n 2.Delete File\n 3.Search File\n 4.Back to main menu  \n Enter Key - ");
      key = input.nextLine();
      switch (key) {
        case "1":
          this.createFile();
          break;
        case "2":
          this.deleteFile();
          break;
        case "3":
          this.searchFile();
          break;
        case "4":          
          break;
        default:
          System.out.println("\nWrong Input!!");
          break;
      }
    }
  }
}
