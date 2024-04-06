package logic;

import player.Player;

public class GameSystem {
    private int currentNumberOnBoard = 0;
    private int numberOfPlayer = 1;

    private boolean gameEnd = false;
    private static final GameSystem instance = new GameSystem();

//    private static final Player player = Player.getInstance();


    public static GameSystem getInstance() {
        return instance;
    }

    public GameSystem(){

    }
    public int checkEffectOnBoard(int numberOnBoard){
        int num1 = ladder(numberOnBoard);
//        System.out.println(num1);
        return num1;
    }
    private int ladder(int numberOnBoard){
        if(numberOnBoard == 8) return 42;
        if(numberOnBoard == 17)  return 35;
        if(numberOnBoard == 40) return 68;
        else if(numberOnBoard == 66)  return 79;
        else return numberOnBoard;
    }

    public boolean isGameEnd(int currentNumberOnBoard){
        if(currentNumberOnBoard >= 81){
            gameEnd = true;
        }
        return gameEnd;
    }

    public void setGameEnd(boolean gameEnd) {
        this.gameEnd = gameEnd;
    }
    public void setNumberOfPlayer(int numberOfPlayer){
        this.numberOfPlayer = numberOfPlayer;
    }




}
