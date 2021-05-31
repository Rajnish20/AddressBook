package com.magic.addressbook.services;

import com.magic.addressbook.entity.Contact;

import java.util.*;

public class Operations implements IOperations {


    @Override
    public void addContacts(List<Contact> contacts, Contact contact) {
        String firstName = contact.getFirstName();
        String lastName = contact.getLastName();
        int flag = 0;
        for (Contact value : contacts) {
            if (value.getFirstName().equalsIgnoreCase(firstName) && value.getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Person already existed");
        else {
            contacts.add(contact);
            System.out.println("Contact added successfully");
        }
    }

    @Override
    public void displayContacts(List<Contact> contacts) {
        for (Contact contact : contacts) System.out.println(contact);
    }


    @Override
    public void deleteContacts(List<Contact> contacts, String firstName, String lastName) {
        int flag = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                contacts.remove(contacts.get(i));
                break;
            }
        }
        if (flag == 1)
            System.out.println("Contact deleted successfully");
        else
            System.out.println("Contact Not found");
    }

    @Override
    public void updateContact(List<Contact> contacts, String firstName, String lastName, Contact contact) {
        int flag = 0;
        for (Contact value : contacts) {
            if (value.getFirstName().equalsIgnoreCase(firstName) && value.getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                value.setFirstName(contact.getFirstName());
                value.setLastName(contact.getLastName());
                value.setCity(contact.getCity());
                value.setState(contact.getState());
                value.setPinCode(contact.getPinCode());
                value.setMobileNo(contact.getMobileNo());
                value.setEmail(contact.getEmail());
                break;
            }
        }
        if (flag == 1)
            System.out.println("Contact updated successfully");
        else
            System.out.println("Contact Not found");
    }


}
