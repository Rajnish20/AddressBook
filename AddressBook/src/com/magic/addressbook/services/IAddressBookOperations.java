package com.magic.addressbook.services;
import com.magic.addressbook.entity.Contact;

import java.util.List;

public interface IAddressBookOperations {

    void createAddressBook(String name);

    void openAddressBook(String name);

    void showAddressBooks();

}
