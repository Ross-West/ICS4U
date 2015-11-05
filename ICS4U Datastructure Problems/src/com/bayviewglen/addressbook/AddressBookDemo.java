package com.bayviewglen.addressbook;

import java.util.Scanner;

public class AddressBookDemo {

	public static void main(String[] args) {
		Contact c1 = new Contact("West", "Ross", "416-778-4855");
		Contact c2 = new Contact("West", "Daniel", "416-778-4855");
		Contact c3 = new Contact("Pangilinan", "Albert", "416-192-8374");
		Contact c4 = new Contact("Jennings", "Mathew", "416-696-9696");
		Contact c5 = new Contact("Lenz", "Jackson", "111-111-1111");
		Contact c6 = new Contact("Borromeo", "Justin", "416-123-4567");
		Contact c7 = new Contact("Lai", "Justin", "416-987-6543");
		Contact c8 = new Contact("Chow", "Nathan", "647-512-4096");
		Contact c9 = new Contact("Lo", "Ivan", "647-128-8192");
		AddressBook addresses = new AddressBook();
		addresses.addContact(c1);
		addresses.addContact(c2);
		addresses.addContact(c3);
		addresses.addContact(c4);
		addresses.addContact(c5);
		addresses.addContact(c6);
		addresses.addContact(c7);
		addresses.addContact(c8);
		addresses.addContact(c9);
		addresses.displayAllContacts();
		Scanner s = new Scanner(System.in);
		System.out.print("Please choose a contact to remove (enter name or number): ");
		String toRemove = s.nextLine();
		AddressBook.searchAndRemoveAddress(toRemove);
		s.close();
	}

}
