package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;
import static com.duckrace.Reward.*;

public class DuckRaceApp {
    private Board board = new Board();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward);
    }

    private Reward promptForReward() {
        Reward reward = null;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please enter D or P ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("D|P")) {
                validInput = true;
                reward = (input.equals("D")) ? DEBIT_CARD : PRIZES;
                /*if (input.equals("D")) {
                    reward = Reward.DEBIT_CARD;
                } else {
                    reward = Reward.PRIZES;
                }*/
            }
        }
        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter ID: 1-16: ");  //TODO: don't hard code 16, replace it with (total ID's), replace with MAX ID
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1,2}")) {
                id = Integer.parseInt(input);
                if (id >= 1 && id <= 16) {  //TODO: DONT HARD CODE 16, REPLACE WITH MAX ID
                    validInput = true;
                }
            }
        }

        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println("WELCOME TO DuckRace");
    }
}
