package com.addressbook.services;

import com.addressbook.entity.*;
import java.util.ArrayList;
import java.util.List;

public class Operations implements IOperations {
	
	List<Contact> contacts = new ArrayList<>();
	@Override
	public void addContacts(Contact contact) 
	{
		contacts.add(contact);
		System.out.println("Contact added successfully to addressbook");
	}
	
	@Override
	public void display()
	{
		for(int i = 0; i < contacts.size();i++)
		{
			System.out.println(contacts.get(i).firstName);
		}
	}

}
