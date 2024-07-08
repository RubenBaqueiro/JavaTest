package org.example.player;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.swing.plaf.metal.MetalBorders;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_dice_too_low(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }

    @Test
    public void wins_dice_big(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);

        assertEquals(true, player.play());
    }
}