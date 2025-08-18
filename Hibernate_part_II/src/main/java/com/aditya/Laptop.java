package com.aditya;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    private String brand;
    private String model;
    private String g_card;
    private long price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getG_card() {
        return g_card;
    }

    public void setG_card(String g_card) {
        this.g_card = g_card;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", g_card='" + g_card + '\'' +
                ", price=" + price +
                '}';
    }
}
