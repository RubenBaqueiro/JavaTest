package org.example.player;

public class Player {
    private Dice dice;
    private int minNumToWin;

    public Player(Dice dice, int minNumToWin) {
        this.dice = dice;
        this.minNumToWin = minNumToWin;
    }

    public boolean play () {
        int number = dice.roll();
        return number > minNumToWin;
    }
}
