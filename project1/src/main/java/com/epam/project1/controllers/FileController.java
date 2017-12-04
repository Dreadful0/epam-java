package com.epam.project1.controllers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

import com.epam.project1.model.entities.Necklace;

public class FileController {

	static Logger logger = Logger.getLogger(FileController.class);

	public static boolean saveFile(Necklace data, String filename) {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(filename)))) {
			
			out.writeObject(data);
			out.flush();
			
		} catch (FileNotFoundException e) {
			logger.error("File not found", e);
			return false;
		} catch (IOException e1) {
			logger.error("Can not write object", e1);
			return false;
		}
		return true;
	}

	public static Necklace readFile(String filename) {
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(filename)))) {
			
			Necklace container = (Necklace)in.readObject();
			logger.debug("Reading complete");
			return container;
			
		} catch (FileNotFoundException e) {
			logger.error("File not found", e);
			return null;
		} catch (IOException e) {
			logger.error("Can not read object", e);
			return null;
		} catch (ClassNotFoundException e) {
			logger.error("Class not found", e);
			return null;
		}
		
	}
}
