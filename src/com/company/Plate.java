package com.company;

public class Plate extends Dish {

    double diameter;

    public Plate(int cracks, double diameter) {
        super(cracks);
        this.diameter = diameter;
    }

    public Plate(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "isUsable=" + isUsable +
                ", isNew=" + isNew +
                ", cracks=" + cracks +
                ", diameter=" + diameter +
                '}';
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean fitsInDishwaser(int diameter) {
        return diameter < this.diameter;
    }
}
