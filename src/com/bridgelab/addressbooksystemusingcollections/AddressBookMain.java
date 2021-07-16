package com.bridgelab.addressbooksystemusingcollections;

import java.util.Scanner;

/********************************************************
 * @author mihir
 *
 * @since 14-July-2021
 * This is the main class for address book system project.
 * From this class all the methods gets called.
 ********************************************************/

public class AddressBookMain
{
    Scanner scanner;

    public AddressBookMain()
    {
        scanner = new Scanner(System.in);
    }

    /**
     * Name : chooseOption
     *
     * Description : Displaying option to user to choose from.
     *
     * Algorithm : In this method displaying user multiple option from switch statement.
     * according to users choice respective method will get called.
     *
     * Modification : First commit 14-July-2021
     */
    public void chooseOption()
    {
        AddressBookService addressBookService = new AddressBookService();
        boolean isExit = false;
        while (!isExit)
        {
            System.out.print("Enter Number As Per Your Choice:\n1.Add-New Contacts:\n2.Display-All Records:\n3.Edit Contact:" +
                    "\n4.Delete Contact:\n5.Search Person In city Or State:\n6.Exit:\n");
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                        //add new contact.
                        addressBookService.addNewContact();
                        break;
                case 2:
                        //display all contact.
                        addressBookService.displayContacts();
                        break;
                case 3:
                        //edit existing contact.
                        addressBookService.editFullContact();
                        break;
                case 4:
                        //delete existing contact.
                        addressBookService.deleteContact();
                        break;
                case 5:
                        //search person by city or state.
                        addressBookService.searchPersonInACityOrState();
                case 6:
                        //Exit from program.
                        isExit = true;
                        break;
                default:
                        System.out.println("Please enter valid input");
            }
        }
    }

    public static void main(String[] args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.chooseOption();
    }
}
