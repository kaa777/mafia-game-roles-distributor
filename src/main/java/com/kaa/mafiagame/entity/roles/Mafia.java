package com.kaa.mafiagame.entity.roles;

public class Mafia {
    private int id;
    private int quantity;
    private String name;

    public Mafia(){}

    public Mafia(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Mafia";
    }
}
