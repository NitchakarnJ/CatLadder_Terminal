package application;

import logic.Dice;
import logic.GameSystem;
import player.Player;

import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private static GameSystem gs = GameSystem.getInstance();
    private static Dice dice = Dice.getInstance();
    private static Player player = new Player(0);


    public static void main(String[] args) {
        dice.randomNumber();
        System.out.println(dice.getNumberDice());

        dice.randomNumber();
        System.out.println(dice.getNumberDice());


        System.out.println("========================================================");
        System.out.println(" Welcome To Cat Ladder which cat gonna make you happy Naa");
        sc = new Scanner(System.in);

        while (true){
            System.out.println("======================================================================");
            System.out.println("Please select the number of players");
            System.out.println("<0> 1 Player");
            System.out.println("<1> 2 Player");
            System.out.println("======================================================================");

            int choice = inputCheck(0, 1);
            if (choice == 0){
                gs.setNumberOfPlayer(1);
                startGameFlow();
            }
        }


    }
    public static void startGameFlow() {
        while (!gs.isGameEnd(player.getCurrentNumberOnBoard())) {
            dice.randomNumber();
            int addToCurrent = dice.getNumberDice();
            System.out.println(dice.getNumberDice());
            System.out.println("go to" + addToCurrent);
            player.setCurrentNumberOnBoard(addToCurrent);
            System.out.println("now" + player.getCurrentNumberOnBoard());
            int choice = inputCheck(0, 1);
        }
    }

    public static int randomFromDice() {
        return dice.getNumberDice();
    }

    public static int inputCheck(int lowestInput, int highestInput) {
        int choice = sc.nextInt();
        while (choice < lowestInput || choice > highestInput) {
            System.out.println("Invalid input");
            choice = sc.nextInt();
        }
        return choice;
    }
}
