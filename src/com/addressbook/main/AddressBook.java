package com.addressbook.main;

import com.addressbook.services.*;
import com.addressbook.entity.*;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner scanner = new Scanner(System.in);
		IOperations operations = new Operations();
		int option;
		do
		{
			System.out.println("Choose Options : ");
			System.out.println("Enter 1 to add contact in Address Book");
			System.out.println("Enter 2 to delete contact from Address Book");
			System.out.println("Enter 3 to edit a contact from Address Book");
			System.out.println("Enter 4 to display");
			System.out.println("Enter 5 to exit");
			option = scanner.nextInt();
			switch(option)
			{
			case 1:
				Contact contact = new Contact();
				System.out.println("Enter First Name");
                String firstName= scanner.nextLine();
                contact.firstName = firstName;
                System.out.println("Enter Last Name");
                String lastName= scanner.nextLine();
                contact.lastName = lastName;
                System.out.println("Enter City");
                String city= scanner.nextLine();
                contact.city = city;
                System.out.println("Enter State");
                String state= scanner.nextLine();
                contact.state = state;
                System.out.println("Enter Zip Code");
                String pincode=scanner.nextLine();
                contact.pincode = pincode;
                System.out.println("Enter Phone Number");
                String mobileNo = scanner.nextLine();
                contact.mobileNo = mobileNo;
                System.out.println("Enter Email");
                String email= scanner.nextLine();
                contact.email = email;
                operations.addContacts(contact);
                break;
			case 4:
				operations.display();
				break;
			default:
				break;
                
              
                
				
			}
			
		}while(option != 5);
		
	}

}
