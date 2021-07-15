package com.bridgelab.addressbooksystemusingcollections;

import java.util.ArrayList;
import java.util.Scanner;

/************************************************************************
 * @author mihir
 *
 * @since 14-July-2021
 * This class holds the logical part of the project.
 * This class has all the necessary methods that are required to maintain,
 * address book and records in it.
 ************************************************************************/

public class AddressBookService
{
    Scanner scanner;
    //To store contacts.
    ArrayList<PersonDetails> contactList;

    //instantiating scanner and ArrayList in constructor.
    public AddressBookService()
    {
        scanner = new Scanner(System.in);
        contactList = new ArrayList<>();
    }

    /**
     * Name : addNewContact
     *
     * Description : Adding new contact to AddressBook.
     *
     * Algorithm : In this method accepting all necessary contact details from user,
     * and adding those all details to store in AddressBook as a new contact.
     *
     * Modification : First commit 14-July-2021.
     */
    public void addNewContact()
    {
            PersonDetails contactDetails = new PersonDetails();

            System.out.print("Enter First Name : ");
            contactDetails.setFirstName(scanner.next());

            System.out.print("Enter Last Name : ");
            contactDetails.setLastName(scanner.next());

            System.out.print("Enter Address : ");
            contactDetails.setAddress(scanner.next());

            System.out.print("Enter City : ");
            contactDetails.setCity(scanner.next());

            System.out.print("Enter State : ");
            contactDetails.setState(scanner.next());

            System.out.print("Enter ZipCode : ");
            contactDetails.setZipCode(scanner.nextInt());

            System.out.print("Enter Phone-Number : ");
            contactDetails.setPhoneNumber(scanner.nextLong());

            System.out.print("Enter Email-Id : ");
            contactDetails.setEmailId(scanner.next());

            contactList.add(contactDetails);
            System.out.println("\nContact added successfully.\n");
    }

    /**
     * Name : displayContacts
     *
     * Description : Displaying all the contact to user.
     *
     * Algorithm : Using for each loop to traverse through array.
     * and printing records rows one by one.
     *
     * Modification : Fist Commit 29-June-2021
     */
    public void displayContacts()
    {
        for(PersonDetails element : contactList)
        {
            if(element != null)
            {
                System.out.println(element);
            }
        }
    }
}
