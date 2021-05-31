package com.magic.addressbook.services;
import com.magic.addressbook.entity.Contact;
import com.magic.addressbook.comtroller.ContactMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class AddressBookOperations implements IAddressBookOperations{
    HashMap<String, List<Contact>> addressBook = new HashMap<>();

    @Override
    public void createAddressBook(String name) {
        addressBook.put(name,new ArrayList<>());
    }

    @Override
    public void openAddressBook(String name) {
         ContactMenu menu = new ContactMenu();
         menu.operations(addressBook.get(name));
    }

    @Override
    public void showAddressBooks() {
        for (Map.Entry mapElement : addressBook.entrySet()) {
            System.out.println((String)mapElement.getKey());
        }

    }

    @Override
    public void searchPersonInCity(String city) {
        int count = 0;
        for (Map.Entry mapElement : addressBook.entrySet()) {
            String key = (String)mapElement.getKey();
            List<Contact> contacts = addressBook.get(key);
            for (Contact contact : contacts) {
                if (contact.getCity().equalsIgnoreCase(city)) {
                    System.out.println(contact);
                    count++;
                }
            }
        }
        System.out.println(count + " Persons are from " + city);

    }

    @Override
    public void searchPersonInState(String state) {
        int count = 0;
        for (Map.Entry mapElement : addressBook.entrySet()) {
            String key = (String)mapElement.getKey();
            List<Contact> contacts = addressBook.get(key);
            for (Contact contact : contacts) {
                if (contact.getState().equalsIgnoreCase(state)) {
                    System.out.println(contact);
                    count++;
                }
            }
        }
        System.out.println(count + " Persons are from " + state);
    }


}
