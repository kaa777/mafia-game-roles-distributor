package com.kaa.mafiagame.entity.roles;

public class Prostitute {
    private int id;
    private int quantity;
    private String name;

    public Prostitute(){}

    public Prostitute(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Prostitute";
    }
}
