package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv1;
    private Television tv2;


    @Before
    public void setUp() {
        tv1 = new Television("Samsung", 32);
        tv2 = new Television("Samsung", 32);
    }

    @Test
    public void changeChannel_shouldStoreValue_validInput()
        throws InvalidChannelException {
            tv1.changeChannel(999);
            assertEquals(999, tv1.getCurrentChannel());
    }


    @Test (expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException()
        throws InvalidChannelException {
            tv1.changeChannel(1000);
            tv1.changeChannel(0);
    }

    @Test
    public void changeChannel_shouldStoreValue_validInput_lowerBound()
    throws InvalidChannelException {
        tv1.changeChannel(1);
        assertEquals(1, tv1.getCurrentChannel());
    }

    @Test (expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_invalidInput_lowerBound()
    throws InvalidChannelException {
        tv1.changeChannel(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_upperBound()
    {
        tv1.setVolume(100);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_upperBound()
    {
        tv1.setVolume(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_lowerBound() {
        tv1.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_validInput_lowerBound() {
        tv1.setVolume(0);
        assertEquals(0, tv1.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_validInput_upperBound() {
        tv1.setVolume(100);
        assertEquals(100, tv1.getVolume());
    }
}