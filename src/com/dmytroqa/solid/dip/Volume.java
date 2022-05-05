package com.dmytroqa.solid.dip;

public class Volume {

    private int lvl;
    boolean isMuted;

    public Volume() {
        this.lvl = 0;
        this.isMuted = false;
    }

    public int getLvl() {
        return lvl;
    }

    public boolean isMuted() {
        return isMuted;
    }

}
