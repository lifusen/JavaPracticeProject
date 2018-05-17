package com.lifusen.www.user;

import com.jfinal.plugin.activerecord.Model;

public class Dengji extends Model<Dengji>
{
  private Integer id;
  private String dengName;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDengName() {
    return this.dengName;
  }

  public void setDengName(String dengName) {
    this.dengName = dengName;
  }
}