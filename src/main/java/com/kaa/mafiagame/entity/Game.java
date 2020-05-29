package com.kaa.mafiagame.entity;

import com.kaa.mafiagame.entity.roles.*;

public class Game {
    private int id;
    private Advocate advocate;
    private Citizen citizen;
    private Comissar comissar;
    private Doctor doctor;
    private DonMafia donMafia;
    private Mafia mafia;
    private Maniac maniac;
    private Prostitute prostitute;
    private Sheriff sheriff;

    public Game(){}

    public Game(Advocate advocate, Citizen citizen, Comissar comissar, Doctor doctor, DonMafia donMafia, Mafia mafia, Maniac maniac, Prostitute prostitute, Sheriff sheriff) {
        this.advocate = advocate;
        this.citizen = citizen;
        this.comissar = comissar;
        this.doctor = doctor;
        this.donMafia = donMafia;
        this.mafia = mafia;
        this.maniac = maniac;
        this.prostitute = prostitute;
        this.sheriff = sheriff;
    }

    public Advocate getAdvocate() {
        return advocate;
    }

    public void setAdvocate(Advocate advocate) {
        this.advocate = advocate;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public Comissar getComissar() {
        return comissar;
    }

    public void setComissar(Comissar comissar) {
        this.comissar = comissar;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public DonMafia getDonMafia() {
        return donMafia;
    }

    public void setDonMafia(DonMafia donMafia) {
        this.donMafia = donMafia;
    }

    public Mafia getMafia() {
        return mafia;
    }

    public void setMafia(Mafia mafia) {
        this.mafia = mafia;
    }

    public Maniac getManiac() {
        return maniac;
    }

    public void setManiac(Maniac maniac) {
        this.maniac = maniac;
    }

    public Prostitute getProstitute() {
        return prostitute;
    }

    public void setProstitute(Prostitute prostitute) {
        this.prostitute = prostitute;
    }

    public Sheriff getSheriff() {
        return sheriff;
    }

    public void setSheriff(Sheriff sheriff) {
        this.sheriff = sheriff;
    }
}
