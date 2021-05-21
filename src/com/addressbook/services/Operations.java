package com.addressbook.services;

import com.addressbook.entity.*;
import java.util.Scanner;

public class Operations implements IOperations {
	Scanner scanner = new Scanner(System.in);
	Contact contact = new Contact();
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String pincode;
	public String mobileNo;
	public String email;

	@Override
	public void addContacts() 
	{

		enterDetails();
		contact.firstName = firstName;
		contact.lastName = lastName;
		contact.address = address;
		contact.city = city;
		contact.state = state;
		contact.pincode = pincode;
		contact.mobileNo = mobileNo;
		contact.email = email;
		System.out.println("Contact Added Successfully to Address Book");
	}
	
	public void enterDetails()
	{
		System.out.println("Enter First Name");
	    firstName = scanner.nextLine();
	    System.out.println("Enter Last Name");
	    lastName = scanner.nextLine();
	    System.out.println("Enter address");
	    address = scanner.nextLine();
	    System.out.println("Enter State");
	    state = scanner.nextLine();
	    System.out.println("Enter city");
	    city = scanner.nextLine();
	    System.out.println("Enter Pincode");
	    pincode = scanner.nextLine();
	    System.out.println("Enter Mobile No");
	    mobileNo = scanner.nextLine();
	    System.out.println("Enter Email Id");
	    email = scanner.nextLine();
	}
	

	@Override
	public void deleteContacts() {
		contact = null;
		
	}

	@Override
	public void updateContacts() {
		enterDetails();
		contact.firstName = firstName;
		contact.lastName = lastName;
		contact.address = address;
		contact.city = city;
		contact.state = state;
		contact.pincode = pincode;
		contact.mobileNo = mobileNo;
		contact.email = email;
		
		System.out.println("Record Updated Successfully");
		
		
	}

}
