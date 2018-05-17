package com.lifusen.www.user;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import java.io.PrintStream;

public class ServiceImp
  implements Service
{
  public Page<User> show()
  {
    Page list = User.dao.paginate(1, 10, "select *", " from user");
    System.out.println(list.toString());
    return list;
  }

  public String add(User user)
  {
    return user.save() ? "添加成功！" : "添加失败！";
  }

  public void delete(Integer id)
  {
    User.dao.deleteById(id);
  }

  public User login(String name)
  {
    return (User)User.dao.findByIdLoadColumns(name, "name");
  }

  public String update(User user)
  {
    System.out.println("kaishixiugai");
    return user.update() ? "修改成功！" : "修改失败！";
  }

  public void testTx(User user)
  {
    Db.update("update user set amount = amount + 10 where id = ?", new Object[] { user.getInt("id") });
    System.out.println(1 / 0);
    Db.update("update user set amount = amount - 10 where id = ?", new Object[] { user.getInt("id") });
  }
}