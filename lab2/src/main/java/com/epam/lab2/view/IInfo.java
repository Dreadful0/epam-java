package com.epam.lab2.view;

public interface IInfo {

	public int GetBooksByAuthorNumber = 1;
	public int GetBooksByPublisherNumber = 2;
	public int GetBooksPublishedAfterNumber = 3;
	public int SortBooksByPublisherNumber = 4;
	public int WriteFileNumber = 5;
	public int ReadFileNumber = 6;
	public int ExitNumber = 0;
	
	public String GetBooksByAuthorString = ") Get books by author";
	public String GetBooksByPublisherString = ") Get books by publisher";
	public String GetBooksPublishedAfterString = ") Get books that was published after some year";
	public String SortBooksByPublisherString = ") Sort books by publisher";
	public String WriteFileString = ") Write file with test data";
	public String ReadFileString = ") Read test data from file";
	public String ExitString = ") Close program";
	public String BackString = "Any number) Back";
	
	public String MainMenuTitle = "---Main menu---";
	public String SubMenuTitle = "---Sub menu---";
	
	public String NoDataString = "data is empty";
	public String Delimeter = "-------------------------------------------";
	
	public String NumberInputString = "Please input the number:";
	public String StringInputString = "Please input the string:";
	public String ErrorInputString = "Invalid input";
	
	public String SAVE_DIRECTORY = "test.dat";
	public String FileLoadSuccess = "File loaded successfully";
	public String FileSaveSuccess = "File saved successfully";
	public String FileLoadFail = "File not loaded";
	public String FileSaveFail = "File not saved";
}
