package com.company;

public class UltraDog extends Dog{
    @Override
    public void addLeg() {
        legs += 2;
    }

    @Override
    public void addEar() {
        ears += 2;
    }

    @Override
    public String toString() {
        return "UltraDog{" +
                "legs=" + legs +
                ", tails=" + tails +
                ", ears=" + ears +
                '}';
    }

    @Override
    public void addTail() {
        tails += 2;
    }
}
