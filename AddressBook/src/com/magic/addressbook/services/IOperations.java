package com.magic.addressbook.services;

import com.magic.addressbook.entity.*;

public interface IOperations {
    void addContacts(Contact contact);

    void displayContacts();

    void deleteContacts(String firstName, String lastName);

    void updateContact(String firstName, String lastName, Contact contact);
}

