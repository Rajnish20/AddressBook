package com.magic.addressbook.services;

import java.util.List;
import com.magic.addressbook.entity.*;

public interface IOperations {
    void addContacts(List<Contact> contacts, Contact contact);

    void displayContacts(List<Contact> contacts);

    void deleteContacts(List<Contact> contacts, String firstName, String lastName);

    void updateContact(List<Contact> contacts, String firstName, String lastName, Contact contact);
}

