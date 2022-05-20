package com.birdwind.waterball.mach_macking_system;

import java.io.Serializable;
import java.util.Random;

public class Coord implements Serializable {
    private int x;
    private int y;

    public Coord() {
        Random random = new Random();
        x = random.nextInt();
        y = random.nextInt();
    }

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{x:" + x + ", y:" + y + "}";
    }
}
