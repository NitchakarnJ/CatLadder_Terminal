package player;

import logic.GameSystem;

public class Player {

    private int currentNumberOnBoard;


    public Player(int currentNumberOnBoard1){
        setCurrentNumberOnBoard(currentNumberOnBoard1);

    }

    public void setCurrentNumberOnBoard(int addRollNum){
        int currentNumberOnBoardStore = getCurrentNumberOnBoard();
        this.currentNumberOnBoard = currentNumberOnBoardStore + addRollNum;
    }
    public int getCurrentNumberOnBoard(){
        return currentNumberOnBoard;
    }

}
