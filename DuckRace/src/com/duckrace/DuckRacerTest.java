package com.duckrace;

import java.sql.SQLOutput;
import java.util.Collection;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer1 = new DuckRacer(1, "Amir");

        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.PRIZES);
        racer1.win(Reward.DEBIT_CARD);

        System.out.println(racer1);

        Collection<Reward> rewards = racer1.getRewards();
        System.out.println(rewards);

        racer1.win(Reward.PRIZES);
        System.out.println(rewards );
    }

}
