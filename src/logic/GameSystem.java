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
