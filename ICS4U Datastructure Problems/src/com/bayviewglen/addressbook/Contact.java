package com.bayviewglen.addressbook;

public class Contact {
	private String lastName;
	private String firstName;
	private String phone;

	public Contact(String lastName, String firstName, String phone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString(){
		return firstName + " " + lastName + " " + phone;
	}
}
