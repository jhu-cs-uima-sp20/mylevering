package com.example.mylevering;

public class ButterflyMenuOption extends MenuOption {

    private String title;
    private String price;
    private String calories;

    ButterflyMenuOption(String t, String p, String c) {
        this.setAll(t, p, c);
    }

    private void setAll(String title, String price, String calories){
        this.title = title;
        this.price = price;
        this.calories = calories;
    }

    public String getTitle() { return title; }
    public String getPrice() { return price; }
    public String getCalories() { return calories; }

}
