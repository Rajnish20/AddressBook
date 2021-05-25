package com.magic.addressbook.comtroller;
import java.util.Scanner;

import com.magic.addressbook.entity.*;
import com.magic.addressbook.services.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAddressBookOperations addressBookOperations = new AddressBookOperations();
        int option;
        do {
            System.out.println("Enter 1 to create new Address Book");
            System.out.println("Enter 2 to open an Address Book");
            System.out.println("Enter 3 to show All Address Book");
            System.out.println("Enter 4 to exit");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    String dummy1 = scanner.nextLine();
                    System.out.println("Enter Address Book Name");
                    String addressBookName = scanner.nextLine();
                    addressBookOperations.createAddressBook(addressBookName);
                    break;
                case 2:
                    String dummy7 = scanner.nextLine();
                    System.out.println("Below mentioned Address Books are available");
                    addressBookOperations.showAddressBooks();
                    System.out.println("Enter name of Address Book");
                    String name = scanner.nextLine();
                    addressBookOperations.openAddressBook(name);
                    break;
                case 3:
                    addressBookOperations.showAddressBooks();
                default:
                    break;
            }

        }while(option != 4);
    }
}
