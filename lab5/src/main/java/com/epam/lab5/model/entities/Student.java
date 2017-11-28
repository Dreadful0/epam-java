package com.epam.lab5.model.entities;

import java.text.DateFormat;
import java.util.Date;

public class Student {

	private String secondName;
	private String firstName;
	private Date birthday;
	private int phoneNumber;
	private String homeAddress;

	public Student() {
	}

	public Student(String secondName, String firstName, Date birthday,
			int phoneNumber, String homeAddress) {
		this.secondName = secondName;
		this.firstName = firstName;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
	}

	public Student(StudentBuilder studentBuilder) {
		this.secondName = studentBuilder.secondName;
		this.firstName = studentBuilder.firstName;
		this.birthday = studentBuilder.birthday;
		this.phoneNumber = studentBuilder.phoneNumber;
		this.homeAddress = studentBuilder.homeAddress;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result
				+ ((secondName == null) ? 0 : secondName.hashCode());
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
		Student other = (Student) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (homeAddress == null) {
			if (other.homeAddress != null)
				return false;
		} else if (!homeAddress.equals(other.homeAddress))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		return "" + secondName + " " + firstName + " " + df.format(birthday) + " "
				+ phoneNumber + " " + homeAddress;
	}

	public static class StudentBuilder {
		private String secondName;
		private String firstName;
		private Date birthday;
		private int phoneNumber;
		private String homeAddress;

		public StudentBuilder() {
		}

		public StudentBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public StudentBuilder secondName(String secondName) {
			this.secondName = secondName;
			return this;
		}

		public StudentBuilder birthday(Date birthday) {
			this.birthday = birthday;
			return this;
		}

		public StudentBuilder phoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public StudentBuilder homeAddress(String homeAddress) {
			this.homeAddress = homeAddress;
			return this;
		}

		public Student build() {
			Student student = new Student(this);
			return student;
		}
	}

}
