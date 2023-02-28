package org.example;
public class Notebook {
    private String brand;
    private String model;
    private String color;


    public Notebook(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;

    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s", brand, model, color);
        return ".";
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }



}