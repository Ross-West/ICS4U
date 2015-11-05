package com.bayviewglen.addressbook;

import java.util.ArrayList;

public class AddressBook {
	public AddressBook() {
	}

	private static ArrayList<Contact> list;

	/**
	 * @param add contact to list
	 */
	public void addContact(Contact contact) {
		list.add(contact);
	}

	/**
	 * @return get list as string
	 */
	public String getAllContacts(ArrayList<Contact> list) {
		return list.toString();
	}

	/**
	 * @param print list to console
	 */
	public void displayAllContacts() {
		System.out.println(list.toString());
	}
	
	/**
	 * @return search the address book
	 */
	public Contact searchForAddress(String s) {
		for(int i = 0; i < list.size(); i++){
			if (list.get(i).getFirstName() == s){
				return list.get(i);
			} else if (list.get(i).getLastName() == s){
				return list.get(i);
			} else if (list.get(i).getPhone() == s){
				return list.get(i);
			}
		}
		return null;
	}
	
	/**
	 * @return search the address book
	 */
	public void searchAndDisplayAddress(String s) {
		for(int i = 0; i < list.size(); i++){
			if (list.get(i).getFirstName() == s){
				System.out.println(list.get(i).toString());
			} else if (list.get(i).getLastName() == s){
				System.out.println(list.get(i).toString());
			} else if (list.get(i).getPhone() == s){
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println("Your search did not find any results.");
	}
	
	public static Contact searchAndRemoveAddress(String s) {
		for(int i = 0; i < list.size(); i++){
			if (list.get(i).getFirstName() == s){
				list.remove(i);
				return(list.get(i));
			} else if (list.get(i).getLastName() == s){
				list.remove(i);
				return(list.get(i));
			} else if (list.get(i).getPhone() == s){
				list.remove(i);
				return(list.get(i));
			}
		} return null;
	}
}
