package com.demo.util;

import java.io.FileInputStream;
import java.util.Properties;

public class Configs {

	static Properties configFile;

	static {
		try {
			String path = "./src/testData/configuration.properties";
			FileInputStream input = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(input);
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);

	}
}
