package com.epam.lab8.task5.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.epam.lab8.task5.model.entities.TextFileData;

public class FileController {

	static Logger logger = Logger.getLogger(FileController.class);
	private File outputFile;

	public FileController(String outputFilePath) {
		outputFile = new File(outputFilePath);
		clearOutput();
	}

	public File getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(File outputFile) {
		this.outputFile = outputFile;
	}

	public TextFileData getData(File file) {
		TextFileData data = new TextFileData(file);
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				data.addLine(line);
			}
		} catch (IOException e) {
			logger.error(e);
		}
		return data;
	}

	public void appendData(TextFileData data) {
		synchronized (outputFile) {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(
					outputFile, true))) {
				writer.write(data.getFile().getName()+" ");
				for (String line : data.getData()) {
					writer.write(line+"\n");
				}
			} catch (IOException e) {
				logger.error(e);
			}
		}
	}

	public void clearOutput() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				outputFile))) {
		} catch (IOException e) {
			logger.error(e);
		}
	}
}
