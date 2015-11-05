package com.bayviewglen.addressbooktests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.addressbook.AddressBook;

public class AddressTests {

	@Test
	public void testRemovingNothing() {
		assertEquals("Nothing Was Removed.",null,AddressBook.searchAndRemoveAddress("ASDF"));
	}

	public void testRemovingIvan() {
		assertEquals("Ivan was removed.",null,AddressBook.searchAndRemoveAddress("Ivan"));
	}
	
	public void testSearchingRoss() {
		assertEquals("Ross was found.",null,AddressBook.searchAndRemoveAddress("Ross"));
	}
	//Not really that much to test
}
