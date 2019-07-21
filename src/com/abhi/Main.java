package com.abhi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobilephone mobilephone = new Mobilephone ("940 735 0431");

    public static void main(String[] args) {
        boolean quit = false;
        turnonphone();
        printactions();
        while(!quit){
            int act = scanner.nextInt();
            scanner.nextLine();

            switch(act){
                case 0: mobilephone.printcontacts();
                    break;
                case 1:
                    addcontact();
                    break;
                case 2:
                    removecontact();
                    break;
                case 3:
                    updatecontact();
                    break;
                case 4:
                    querycontact();
                    break;
            }
        }
    }
    private static void addcontact(){
        System.out.println(" Enter the contact name :");
        String name = scanner.nextLine();
        System.out.println(" Enter the contact phone :");
        String phone = scanner.nextLine();
        Contacts newcontact = Contacts.createcontact(name, phone);
        if(mobilephone.addnew(newcontact)){
            System.out.println(" The new contact name is " + name + " the number is " + phone );
        }
        else {
            System.out.println(" Contact already found " + name);
        }
    }

    private static void removecontact(){
        System.out.println(" Enter the name ");
        String name = scanner.nextLine();
        mobilephone.removecontact()
    }
    private static void turnonphone(){
        System.out.println(" Switching on the phone! ");
    }
    private static void printactions(){
        System.out.println("\n Available actions:\n press:\n");
        System.out.println(" 0 - print the list of contacts"+
                           " 1 - to add the contact " +
                           " 2 - to remove the contact " +
                           " 3 - to update the contact " +
                           " 4 - to query the contact  " +
                           " 5 - to print list of available actions ");
        System.out.println(" Choose your actions: ");
    }
}
