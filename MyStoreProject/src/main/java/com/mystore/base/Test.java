package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
	public static Properties prop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\config.properties");
		prop.load(ip);
    System.out.println(prop.getProperty("url"));
	}

}
