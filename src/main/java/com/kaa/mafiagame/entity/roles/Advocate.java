package com.kaa.mafiagame.entity.roles;

public class Advocate {
    private int id;
    private int quantity;
    private String name;

    public Advocate(){}

    public Advocate(int quantity) {
        this.id = 1;
        this.quantity = quantity;
        this.name = "Advocate";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
