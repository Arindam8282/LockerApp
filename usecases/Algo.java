package usecases;

import models.LockerFile;
import java.util.ArrayList;

public class Algo {

    private ArrayList<LockerFile> names;
    private int length;
    public Algo(ArrayList<LockerFile> names, int length) {
        this.setNames(names);
        this.setLength(length);
    }
    public Algo(){
        this.setNames(new ArrayList<LockerFile>());
        this.setLength(0);
    }
    public ArrayList<LockerFile> getNames(){return this.names;}
    public void setNames(ArrayList<LockerFile> arr){this.names=arr;}
    public int getLength(){return this.length;}
    public void setLength(int len){this.length=len;}

  public LockerFile binarySearch(ArrayList<LockerFile> arr, String x) {
      int l = 0, r = arr.size() - 1;
      while (l <= r) {
          int m = l + (r - l) / 2;
          int res = x.compareTo(arr.get(m).getName());
          if (res == 0)
              return arr.get(m);
          if (res > 0)
              l = m + 1;
          else
              r = m - 1;
      }

      return null;
  }

  public void sort(ArrayList<LockerFile> array) {
      if (array == null || array.size() == 0) {
          return;
      }
      this.names = array;
      this.length = array.size();
      quickSort(0, length - 1);
  }

  private void quickSort(int lowerIndex, int higherIndex) {
      int i = lowerIndex;
      int j = higherIndex;
      String pivot = this.names.get(lowerIndex + (higherIndex - lowerIndex) / 2).getName();

      while (i <= j) {
          while (this.names.get(i).getName().compareToIgnoreCase(pivot) < 0) {
              i++;
          }

          while (this.names.get(j).getName().compareToIgnoreCase(pivot) > 0) {
              j--;
          }

          if (i <= j) {
              exchangeNames(i, j);
              i++;
              j--;
          }
      }
      //call quickSort recursively
      if (lowerIndex < j) {
          quickSort(lowerIndex, j);
      }
      if (i < higherIndex) {
          quickSort(i, higherIndex);
      }
  }

  private void exchangeNames(int i, int j) {
      String temp = this.names.get(i).getName();
      this.names.get(i).setName(this.names.get(j).getName());
      this.names.get(j).setName(temp);
  }
}