package ArrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("6012 3377 721");

    public static void main(String[] args) {
        boolean quit = false;
        startingPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = s.nextLine();
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + ", already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = s.nextLine();
        if(mobilePhone.queryContact(name) != null) {
            System.out.println("Contact exists");
            return;
        }
        System.out.println("Enter phone number: ");
        String newNumber = s.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully removed record");
        } else {
            System.out.println("Contact not found");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
    }

    private static void startingPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("Available action: press");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
