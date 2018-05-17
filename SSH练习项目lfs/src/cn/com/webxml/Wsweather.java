package cn.com.webxml;

import java.util.List;

public class Wsweather {
	
	public static List<String> getWeather(String place)
	{
		WeatherWebService wws = new WeatherWebService();
		WeatherWebServiceSoap wwss = wws.getWeatherWebServiceSoap();
		ArrayOfString aos =wwss.getWeatherbyCityName(place);
		return aos.getString();
	}

}
