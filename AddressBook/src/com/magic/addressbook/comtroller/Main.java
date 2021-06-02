package com.magic.addressbook.comtroller;

import java.util.Scanner;

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
            System.out.println("Enter 4 to search Persons in city");
            System.out.println("Enter 5 to search Persons in state");
            System.out.println("Enter 6 to see the number of Persons in a particular City");
            System.out.println("Enter 7 to see the number of Persons in a particular State");
            System.out.println("Enter 8 to exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter Address Book Name");
                    String addressBookName = scanner.nextLine();
                    addressBookOperations.createAddressBook(addressBookName);
                    break;
                case 2:
                    System.out.println("Below mentioned Address Books are available");
                    addressBookOperations.showAddressBooks();
                    System.out.println("Enter name of Address Book");
                    String name = scanner.nextLine();
                    addressBookOperations.openAddressBook(name);
                    break;
                case 3:
                    addressBookOperations.showAddressBooks();
                    break;
                case 4:
                    System.out.println("Enter City");
                    String city = scanner.nextLine();
                    addressBookOperations.searchPersonInCity(city);
                    break;
                case 5:
                    System.out.println("Enter State");
                    String state = scanner.nextLine();
                    addressBookOperations.searchPersonInState(state);
                    break;
                case 6:
                    System.out.println("Enter State");
                    String countInCity = scanner.nextLine();
                    addressBookOperations.getCountInCity(countInCity);
                    break;
                case 7:
                    System.out.println("Enter State");
                    String countInState = scanner.nextLine();
                    addressBookOperations.getCountInState(countInState);
                    break;
                default:
                    break;
            }

        } while (option != 8);
    }
}
