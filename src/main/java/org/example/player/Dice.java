package org.example.player;

import java.util.Random;

public class Dice {

    public int sides;

    public int roll () {
        return new Random().nextInt(sides)+1;
    }
    public Dice(int sides) {
        this.sides = sides;
    }
}
