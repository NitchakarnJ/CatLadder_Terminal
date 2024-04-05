package logic;

public class GameSystem {
    private int currentNumberOnBoard = 0;
    private int numberOfPlayer = 1;

    private boolean gameEnd = false;
    private static final GameSystem instance = new GameSystem();

    public static GameSystem getInstance() {
        return instance;
    }

    public GameSystem(){
        Start();
    }
    public void Start(){
        setCurrentNumberOnBoard(0);
    }
    public boolean isGameEnd(){
        if(getCurrentNumberOnBoard() >= 81){
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

    public void setCurrentNumberOnBoard(int addRollNum){
        int currentNumberOnBoardStore = getCurrentNumberOnBoard();
        this.currentNumberOnBoard = currentNumberOnBoardStore + addRollNum;
    }
    public int getCurrentNumberOnBoard(){
        return currentNumberOnBoard;
    }


}
