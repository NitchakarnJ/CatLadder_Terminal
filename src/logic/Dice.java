package logic;

import java.util.Random;

public class Dice {
    public int numberDice;
    private static final Dice instance = new Dice();

    public static Dice getInstance() {
        return instance;
    }

    public Dice(){
       setNumberDice(0);
    }
    private void setNumberDice(int numberDice){
        this.numberDice = numberDice;
    }
    public void randomNumber(){
        setNumberDice(new Random().nextInt(1, 7));
    }
    public int getNumberDice(){
        return numberDice;
    }


}
