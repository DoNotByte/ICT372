package com.example.ict372;
import java.io.Serializable;  //allows to pass Product objects in between activities like from home --> details etc.
import java.util.Locale; // allows localization adjustments to information based on country, such as some countries might use "." instead of a "," in certain countries etc.

// Product data section


public class Product implements Serializable {

    private String name;
    private String description;
    private double price;
    private int imageResourceId; // link it to a drawable/img (for instance -> R.drawable.bag)

    public Product (String name, String description, double price, int imageResourceId){
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;


    }

    //Getters for vars and prod data

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String getFormattedPrice(){ //formatting printing will be based on the location of Australia
        return String.format(Locale.forLanguageTag("en-AU"), "$%.2f", price);
    }

}
