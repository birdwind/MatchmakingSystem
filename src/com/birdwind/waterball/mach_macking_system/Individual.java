package com.birdwind.waterball.mach_macking_system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Individual implements Serializable {
    private Long id;
    private GenderEnums gender;
    private Integer age;
    private String intro;
    private ArrayList<String> habits;
    private Coord coord;

    private PairingStrategyType pairingStrategyType;

    public Individual(Long id, GenderEnums gender, Integer age, String intro, ArrayList<String> habits, Coord coord, PairingStrategyType pairingStrategyType) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.intro = intro;
        this.habits = habits;
        this.coord = coord;
        this.pairingStrategyType = pairingStrategyType;
    }

    @Override
    public String toString() {
        return id + ", " + gender.toString() + ", " + age + ", " + intro + ", " + habits + ", " + coord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GenderEnums getGender() {
        return gender;
    }

    public void setGender(GenderEnums gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public ArrayList<String> getHabits() {
        return habits;
    }

    public void setHabits(ArrayList<String> habits) {
        this.habits = habits;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public PairingStrategyType getPairingStrategyType() {
        return pairingStrategyType;
    }

    public void setPairingStrategyType(PairingStrategyType pairingStrategyType) {
        this.pairingStrategyType = pairingStrategyType;
    }

    public Individual match(List<Individual> individuals){
        return pairingStrategyType.pair(this, individuals);
    }
}
