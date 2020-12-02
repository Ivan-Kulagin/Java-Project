package ru.mirea.lab12;

public class Address {

    private String stringTokenizer;
    private String address[];
    private String addressRaw;

    Address(String addressRaw){
        stringTokenizer = " ";
        this.addressRaw = addressRaw;
        address = addressRaw.split(stringTokenizer);
    }

    Address(String addressRaw, String stringTokenizer){
        this.stringTokenizer = stringTokenizer;
        this.addressRaw = addressRaw;
        address = addressRaw.split(stringTokenizer);
    }

    private void split(){
    }

    public String getAddress(){
        String s = address[0];
        for (int i = 1; i < address.length; i++){
            s += " | " + address[i];
        }
        return  s;
    }
}
