package com.epam.lab8.task5.model.entities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TextFileData {
	
	private File file;
	private List<String> data;
	
	public TextFileData(File file) {
		this.file = file;
		this.data = new ArrayList<String>();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public void addLine(String line){
		data.add(line);
	}

	@Override
	public String toString() {
		return "TextFileData [file=" + file.toString() + ", data=" + data + "]";
	}

	
}
