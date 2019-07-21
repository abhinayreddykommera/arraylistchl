package com.abhi;

import java.util.ArrayList;

/**
 * Created by abhinayreddy on 9/6/2017.
 */
public class Mobilephone {
    private String mynumber;
    private ArrayList<Contacts> mycontacts;

    public Mobilephone(String mynumber) {
        this.mynumber = mynumber;
        this.mycontacts = new ArrayList<Contacts>();
    }

    public boolean addnew (Contacts contacts){
        if(findcontact(contacts.getName())>=0){
            System.out.println(" Contact is in the list ");
            return false;
        }
        mycontacts.add(contacts);
        return true;
    }
    public void printcontacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.mycontacts.size();i++){
            System.out.println(i+1 + "." +
                               this.mycontacts.get(i).getName() +" --> " +
                               this.mycontacts.get(i).getPhonenumber());
        }
    }

    public boolean updatecontact (Contacts oldcontact, Contacts newcontact){
        int findposition = findcontact(oldcontact);
        if(findposition > 0){
            System.out.println(oldcontact.getName() + " was not found. ");
            return false;
        }
        this.mycontacts.set(findposition , newcontact);
        System.out.println(oldcontact.getName() + " has been replaced with " + newcontact.getName());
        return true;
    }

    public boolean removecontact(Contacts contacts){
        int findposition = findcontact(contacts);
        if(findposition < 0){
            System.out.println(contacts.getName() + " was not found");
            return false;
        }
        this.mycontacts.remove(findposition);
        System.out.println(contacts.getName() + " has been removed ");
        return true;
    }

    private int findcontact(Contacts contacts){
        return this.mycontacts.indexOf(contacts);
    }
    private int findcontact(String name){
        for(int i=0;i<mycontacts.size();i++){
            Contacts contact = this.mycontacts.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    public String querycontact(Contacts contacts){
        if(findcontact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

}
