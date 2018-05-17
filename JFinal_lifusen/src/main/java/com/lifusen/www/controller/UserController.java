package com.lifusen.www.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.jfinal.upload.UploadFile;
import com.lifusen.www.interceptor.SeeViewPathInterceptor;
import com.lifusen.www.tool.FileNaming;
import com.lifusen.www.user.Service;
import com.lifusen.www.user.ServiceImp;
import com.lifusen.www.user.User;
import com.lifusen.www.validator.UserValidator;
import java.io.File;
import java.io.PrintStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Before(SeeViewPathInterceptor.class)
public class UserController extends Controller
{
  private Service service = (Service)enhance(ServiceImp.class);

  public void index() { render("index.html"); }

  public void login() {
//    setSessionAttr("user", this.service.login(getPara("name")));
    render("index.html");
  }
  public void loginForm() {
    User user = (User)User.dao.findById(getParaToInt());

    render("loginForm.html");
  }
  @Before(Tx.class)
  public void testTx() {
    this.service.testTx((User)User.dao.findById(getParaToInt()));
    show();
  }
  public void delete() {
    this.service.delete(getParaToInt(0));
    show();
  }
  public void updateForm() {
    User user = (User)User.dao.findById(getPara());
    System.out.println(user.toString());
    setAttr("updateUser", user);
    render("updateForm.html");
  }
  public void update() {
    System.out.println(getPara("id"));
    User user = (User)User.dao.findById(getPara("id"));
    user.set("name", getPara("name"));
    user.set("content", getPara("content"));
    setAttr("updateMsg", this.service.update(user));
    setAttr("updateUser", user);
    render("updateForm.html");
  }

  @Before(UserValidator.class)
  public void add()
  {
    UploadFile file = getFile();
    User user = (User)getModel(User.class, "");
    String photo = FileNaming.getPhotoName();
    if (file != null) {
      file.getFile().renameTo(new File(getRequest().getSession().getServletContext().getRealPath("/upload/") + photo));
    }

    user.set("photo", photo);

    System.out.println("上传文件user:" + user.toString());
    setAttr("addMsg", this.service.add(user));
    render("addForm.html");
  }
  public void addForm() {
    render("addForm.html");
  }

  public void show()
  {
    setAttr("basePath", getRequest().getSession().getServletContext().getRealPath("/upload/"));
    setAttr("users", this.service.show());
    render("show.html");
  }
}