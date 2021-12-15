package com.example.homework31;

public class Information {
private String nameContacts;
private int number;
private int image;

    public Information(String nameContacts, int number, int image) {
        this.nameContacts = nameContacts;
        this.number = number;
        this.image = image;
    }

    public String getNameContacts() {
        return nameContacts;
    }

    public void setNameContacts(String nameContacts) {
        this.nameContacts = nameContacts;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
