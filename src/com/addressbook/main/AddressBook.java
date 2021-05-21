package com.addressbook.main;

import com.addressbook.services.*;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		System.out.println("Choose Options : ");
		System.out.println("Enter 1 to add contact in Address Book");
		System.out.println("Enter 2 to delete contact from Address Book");
		System.out.println("Enter 3 to edit a contact from Address Book");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		IOperations operations = new Operations();

		if (option == 1)
			operations.addContacts();
		else if(option == 2)
			operations.deleteContacts();
		

	}

}
