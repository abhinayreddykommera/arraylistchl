package com.abhi;

/**
 * Created by abhinayreddy on 9/6/2017.
 */
public class Contacts {
    public String name;
    public String phonenumber;

    public Contacts(String name, String phonenumber) {

        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contacts createcontact(String name, String phonenumber){
        return new Contacts(name, phonenumber);
    }
}
