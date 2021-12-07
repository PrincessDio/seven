package com.company;

public class HydraDog extends Dog{

    @Override
    public void deleteLeg() {
        legs += 3;
    }

    @Override
    public void deleteEar() {
        ears += 3;
    }

    @Override
    public void deleteTail() {
        tails += 3;
    }

    @Override
    public String toString() {
        return "HydraDog{" +
                "legs=" + legs +
                ", tails=" + tails +
                ", ears=" + ears +
                '}';
    }
}
