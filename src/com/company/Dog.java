package com.company;

public abstract class Dog {

    int legs;
    int tails;
    int ears;

    public Dog(int legs, int tails, int ears) {
        this.legs = legs;
        this.tails = tails;
        this.ears = ears;
    }

    public Dog() {
        legs = 4;
        ears = 2;
        tails = 1;
    }

    public int getLegs() {
        return legs;
    }

    public int getTails() {
        return tails;
    }

    public int getEars() {
        return ears;
    }

    public void addLeg() {
        legs++;
    }

    public void addEar() {
        ears++;
    }

    public void addTail() {
        tails++;
    }

    public void deleteLeg() {
        legs--;
    }

    public void deleteEar() {
        ears--;
    }

    public void deleteTail() {
        tails--;
    }
}
