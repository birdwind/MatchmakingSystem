package com.birdwind.waterball.mach_macking_system;

import java.util.List;

public class DistanceBasedPairingStrategy implements PairingStrategyType {
    @Override
    public Individual pair(Individual individual, List<Individual> targets) {
        Individual minTarget = null;
        double minDistance = 0;
        for (Individual target : targets) {
            double distance = countDistance(individual.getCoord(), target.getCoord());
            if(minDistance == 0){
                minDistance = distance;
                minTarget = target;
            }
            if (distance < minDistance) {
                minDistance = distance;
                minTarget = target;
            }
        }
        return minTarget;
    }

    private double countDistance(Coord selfCoord, Coord targetCoord) {
        return Math.abs(Math.sqrt(Math.pow(selfCoord.getY() - targetCoord.getY(), 2) + Math.pow(selfCoord.getX() - targetCoord.getX(), 2)));
    }
}
