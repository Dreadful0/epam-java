package com.epam.lab2.back;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Book {

	private String name;
	private String author;
	private String publisher;
	private int year;
	private int sheetsNumber;
	private double price;

	public Book() {
	}

	public Book(String name, String author, String publisher, int year,
			int sheetsNumber, double price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.sheetsNumber = sheetsNumber;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSheetsNumber() {
		return sheetsNumber;
	}

	public void setSheetsNumber(int sheetsNumber) {
		this.sheetsNumber = sheetsNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + sheetsNumber;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (sheetsNumber != other.sheetsNumber)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
