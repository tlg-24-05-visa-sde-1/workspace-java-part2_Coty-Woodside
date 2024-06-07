package com.duckrace;

class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
       // board.dumpStudentIDMap();

        board.update(2,Reward.DEBIT_CARD);
        board.update(3,Reward.DEBIT_CARD);
        board.update(2,Reward.PRIZES);
        board.update(1,Reward.PRIZES);
        board.update(11,Reward.DEBIT_CARD);
        board.update(12,Reward.PRIZES);

        board.show();
    }

}
