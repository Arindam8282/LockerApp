package models;

import java.util.Date;

public class LockerFile {
  private String name,extension;
  private Date createTime;

  public LockerFile(String name, String extension, Date createTime) {
    this.setName(name);
    this.setExtension(extension);
    this.setCreateTime(createTime);
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
