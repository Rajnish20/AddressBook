package com.magic.addressbook.services;

import com.magic.addressbook.entity.Contact;
import com.magic.addressbook.comtroller.ContactMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class AddressBookOperations implements IAddressBookOperations {
    HashMap<String, List<Contact>> addressBook = new HashMap<>();

    @Override
    public void createAddressBook(String name) {
        addressBook.put(name, new ArrayList<>());
    }

    @Override
    public void openAddressBook(String name) {
        ContactMenu menu = new ContactMenu();
        menu.operations(addressBook.get(name));
    }

    @Override
    public void showAddressBooks() {
        for (Map.Entry mapElement : addressBook.entrySet()) {
            System.out.println((String) mapElement.getKey());
        }

    }

    @Override
    public void searchPersonInCity(String city) {
        for (Map.Entry mapElement : addressBook.entrySet()) {
            List<Contact> contacts = addressBook.get((String) mapElement.getKey());
            contacts.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
        }
    }

    @Override
    public void searchPersonInState(String state) {
        for (Map.Entry mapElement : addressBook.entrySet()) {
            List<Contact> contacts = addressBook.get((String) mapElement.getKey());
            contacts.stream().filter(n -> n.getState().equalsIgnoreCase(state)).forEach(System.out::println);
        }
    }



}
