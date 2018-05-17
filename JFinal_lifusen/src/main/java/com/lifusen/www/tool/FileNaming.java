package com.lifusen.www.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileNaming
{
  public static String getPhotoName()
  {
    SimpleDateFormat sdf = new SimpleDateFormat();
    sdf.applyPattern("yyyyMMddhhmmssSSS_");
    return sdf.format(new Date()) + (int)((Math.random() * 9.0D + 1.0D) * 10000.0D) + ".jpg";
  }
}