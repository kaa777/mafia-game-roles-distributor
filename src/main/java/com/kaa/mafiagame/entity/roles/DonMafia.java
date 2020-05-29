package com.kaa.mafiagame.entity.roles;

public class DonMafia {
    private int id;
    private int quantity;
    private String name;

    public DonMafia(){}

    public DonMafia(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Don of Mafia";
    }
}
