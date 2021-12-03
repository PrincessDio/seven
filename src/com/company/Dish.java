package com.company;

public abstract class Dish {

    boolean isUsable;
    boolean isNew;
    int cracks;

    public Dish(int cracks) {
        this.cracks = cracks;
        correction();
    }

    public Dish() {
        isUsable = true;
        isNew = true;
        this.cracks = 0;
    }

    public void setCracks(int cracks) {
        this.cracks = cracks;
        correction();
    }

    public boolean isUsable() {
        return isUsable;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getCracks() {
        return cracks;
    }

    public void crack() {
        cracks++;
        correction();
    }

    protected void correction() {
        if (cracks > 0)
            this.isNew = false;
        else
            this.isNew = true;
        if (cracks > 5)
            this.isUsable = false;
        else
            this.isUsable = true;
    }
}
