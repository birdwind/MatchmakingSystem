package com.birdwind.waterball.mach_macking_system;

public enum GenderEnums {
    MALE(1), FEMALE(2);

    private final int value;

    GenderEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static GenderEnums parse(int value){
        for(GenderEnums genderEnums: GenderEnums.values()){
            if(genderEnums.value == value){
                return genderEnums;
            }
        }
        return null;
    }
}
