package com.kaa.mafiagame.entity.roles;

public class Sheriff {
    private int id;
    private int quantity;
    private String name;

    public Sheriff(){}

    public Sheriff(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Sheriff";
    }
}
