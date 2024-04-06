package player;

import logic.GameSystem;

public class Player {

    private int currentNumberOnBoard;
    private static final GameSystem gs = GameSystem.getInstance();
    private static final Player player = new Player(0);



    public Player(int currentNumberOnBoard1){

        setCurrentNumberOnBoard(currentNumberOnBoard1);

    }

    public void setCurrentNumberOnBoard(int addRollNum){
        int currentNumberOnBoardStore = getCurrentNumberOnBoard();
        this.currentNumberOnBoard = currentNumberOnBoardStore + addRollNum;
        // ถ้าค่าที่ต้องกระโดดไป เท่ากับ ช่องที่มันอยู่ แปลว่าไม่ต้องกระโดด
        if(this.currentNumberOnBoard != gs.checkEffectOnBoard(this.currentNumberOnBoard)){
            System.out.println("before jump "+getCurrentNumberOnBoard());
            int newPosition = gs.checkEffectOnBoard(this.currentNumberOnBoard);
            this.currentNumberOnBoard = newPosition;
        }
    }
    public int getCurrentNumberOnBoard(){
        return currentNumberOnBoard;
    }

}
