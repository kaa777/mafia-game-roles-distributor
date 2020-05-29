package com.kaa.mafiagame.entity.roles;

public class Doctor {
    private int id;
    private int quantity;
    private String name;

    public Doctor(){}

    public Doctor(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Doctor";
    }
}
