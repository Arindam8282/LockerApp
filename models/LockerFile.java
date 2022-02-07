package models;

import java.util.Date;

public class LockerFile {
  private String name,extension;
  private Date createTime;
  private int index;

  public LockerFile(String name, String extension, Date createTime, int index) {
    this.name = name;
    this.extension = extension;
    this.createTime = createTime;
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
