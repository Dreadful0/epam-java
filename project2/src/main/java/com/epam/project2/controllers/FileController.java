package com.epam.project2.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

public class FileController {

	static Logger logger = Logger.getLogger(FileController.class);

	public static String getData(String filePath) {
		File file = new File(filePath);
		StringBuilder builder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
		} catch (IOException e) {
			logger.error(e);
		}
		return builder.toString();
	}

}
