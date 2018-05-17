package com.lifusen.www.user;

import com.jfinal.plugin.activerecord.Page;

public abstract interface Service
{
  public abstract Page<User> show();

  public abstract String add(User paramUser);

  public abstract void delete(Integer paramInteger);

  public abstract User login(String paramString);

  public abstract String update(User paramUser);

  public abstract void testTx(User paramUser);
}