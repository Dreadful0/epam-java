package com.epam.lab8.task5.model.entities;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import com.epam.lab8.task5.controllers.FileController;

public class FSFJProcessor {
	
	private FileController con;
	private String startDirectoryPath;
	private char expectedChar;
	
	public FSFJProcessor(FileController con, String startDirectoryPath, char expectedChar) {
		this.con = con;
		this.startDirectoryPath = startDirectoryPath;
		this.expectedChar = expectedChar;
	}

	public void process(){
		ForkJoinPool pool = new ForkJoinPool(8);
		pool.invoke(new DirectoryProcessor(startDirectoryPath));
	}

	private class DirectoryProcessor extends RecursiveAction{
		
		String directoryPath;

		public DirectoryProcessor(String directoryPath) {
			super();
			this.directoryPath = directoryPath;
		}

		@Override
		protected void compute() {
			File directory = new File(directoryPath);
			File[] fList = directory.listFiles();
			List<DirectoryProcessor> forks = new LinkedList<FSFJProcessor.DirectoryProcessor>();
			for (File file : fList) {
		        if (file.isDirectory()) {
		            DirectoryProcessor dirProc = new DirectoryProcessor(file.getAbsolutePath());
		            forks.add(dirProc);
		            dirProc.fork();
		        } else if (file.isFile()) {
		        	processFile(file);
		        }
		    }
			for (DirectoryProcessor directoryProcessor : forks) {
				directoryProcessor.join();
			}
		}
		
		private void processFile(File file){
			TextFileData data = con.getData(file);
			TextFileData result = new TextFileData(file);
			int wordsNumber = 0;
			for (String line : data.getData()) {
				String[] words = line.split("\\W+");
				for (int i = 0; i < words.length; i++) {
			        if (words[i].toLowerCase().startsWith(""+expectedChar)){
			        	wordsNumber++;
			        }
			    }
			}
			result.addLine("Number of words: "+wordsNumber);
			con.appendData(result);
		}
	}
}
