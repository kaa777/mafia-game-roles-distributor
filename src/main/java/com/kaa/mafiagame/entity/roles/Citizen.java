package com.kaa.mafiagame.entity.roles;

public class Citizen {
    private int id;
    private int quantity;
    private String name;

    public Citizen(){}

    public Citizen(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Citizen";
    }
}
