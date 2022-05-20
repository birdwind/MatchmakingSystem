package com.birdwind.waterball.mach_macking_system;

import java.util.List;

public interface PairingStrategyType {
    Individual pair(Individual individual, List<Individual> targets);
}
