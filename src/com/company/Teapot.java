package com.company;


import static java.lang.Double.min;

public class Teapot extends Dish {

    double volume;
    double fullness;

    public Teapot() {
        volume = 10;
        fullness = 0;
    }

    public Teapot(double volume, double fullness) {
        this.volume = volume;
        this.fullness = fullness;
    }

    public Teapot(double volume) {
        this.volume = volume;
        this.fullness = 0;
    }

    public Teapot(int cracks, double volume, double fullness) {
        super(cracks);
        this.volume = volume;
        this.fullness = fullness;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFullness() {
        return fullness;
    }

    public void setFullness(double fullness) {
        this.fullness = fullness;
    }

    public void addWater(double water) {
        this.volume = min(fullness + water, volume);
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "isUsable=" + isUsable +
                ", isNew=" + isNew +
                ", cracks=" + cracks +
                ", volume=" + volume +
                ", fullness=" + fullness +
                '}';
    }
}
