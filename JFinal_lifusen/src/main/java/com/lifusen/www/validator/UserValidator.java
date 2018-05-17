package com.lifusen.www.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class UserValidator extends Validator
{
  protected void validate(Controller c)
  {
    validateRequiredString("name", "nameMsg", "姓名输入不正确");
    validateRequiredString("content", "contentMsg", "介绍输入不正确");
  }

  protected void handleError(Controller c)
  {
    c.keepPara(new String[] { "name" });
    c.keepPara(new String[] { "content" });
    c.render("addForm.html");
  }
}