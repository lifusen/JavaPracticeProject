package com.lifusen.www.user;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;
import java.util.Map;

public class User extends Model<User>
  implements IBean
{
  public static final User dao = new User();
  private Integer id;
  private String name;
  private String content;
  private Integer dengjiid;
  private Double amount;
  private String photo;

  protected Map<String, Object> _getAttrs()
  {
    Map attr = super._getAttrs();
    attr.put("id", getId());
    attr.put("name", getName());
    attr.put("content", getContent());
    attr.put("dengjiid", getDengjiid());
    attr.put("photo", getPhoto());
    return attr;
  }

  public String getPhoto()
  {
    return this.photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public Double getAmount() {
    return this.amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public Integer getId() {
    return this.id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getContent() {
    return this.content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Integer getDengjiid() {
    return this.dengjiid;
  }
  public void setDengjiid(Integer dengjiid) {
    this.dengjiid = dengjiid;
  }
}