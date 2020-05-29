package com.kaa.mafiagame.entity.roles;

public class Comissar {
    private int id;
    private int quantity;
    private String name;

    public Comissar(){}

    public Comissar(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = "Comissar";
    }
}
