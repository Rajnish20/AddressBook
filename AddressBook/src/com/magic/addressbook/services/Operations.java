package com.magic.addressbook.services;

import com.magic.addressbook.entity.Contact;

import java.util.*;

public class Operations implements IOperations {

    List<Contact> contacts = new ArrayList<>();

    @Override
    public void addContacts(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    @Override
    public void displayContacts() {
        for (int i = 0; i < contacts.size(); i++)
            System.out.println(contacts.get(i));
    }


    @Override
    public void deleteContacts(String firstName, String lastName) {
        int flag = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName))
            {
                flag = 1;
                contacts.remove(contacts.get(i));
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact deleted successfully");
        else
            System.out.println("Contact Not found");
    }

    @Override
    public void updateContact(String firstName, String lastName, Contact contact) {
        int flag = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName))
            {
                flag = 1;
                contacts.get(i).setFirstName(contact.getFirstName());
                contacts.get(i).setLastName(contact.getLastName());
                contacts.get(i).setCity(contact.getCity());
                contacts.get(i).setState(contact.getState());
                contacts.get(i).setPinCode(contact.getPinCode());
                contacts.get(i).setMobileNo(contact.getMobileNo());
                contacts.get(i).setEmail(contact.getEmail());
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact updated successfully");
        else
            System.out.println("Contact Not found");
    }


}
