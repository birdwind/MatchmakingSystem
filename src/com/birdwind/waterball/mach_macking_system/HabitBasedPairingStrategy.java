package com.birdwind.waterball.mach_macking_system;

import java.util.ArrayList;
import java.util.List;

public class HabitBasedPairingStrategy implements PairingStrategyType {
    @Override
    public Individual pair(Individual individual, List<Individual> targets) {
        Individual match = targets.get(0);
        int sameHabitCount = 0;
        for (Individual target : targets) {
            ArrayList<String> sameHabit = individual.getHabits();
            sameHabit.retainAll(target.getHabits());
            if (sameHabit.size() > sameHabitCount) {
                sameHabitCount = sameHabit.size();
                match = target;
            }
        }
        return match;
    }
}
