package snakeandladderSimulator;

public class SnakeandLadderSimulator {
    public static void main(String[] args) {
        System.out.println("-----Welcome to Snake and Ladder Simulator-----");
        int startngPosition = 0;
        int numberofPlayers = 1;
        int finalPosition = 100;
        int noPlay = 0;
        int counter = 0;
        int ladder = 1;
        int snake = 2;
        int playerPos = startngPosition;
        String diceCountng = String.valueOf(playerPos);
        int diceRoll = (int) (Math.random() * 6) + 1;
        int optionChoice = (int) (Math.random() * 10) % 3;
        int counterDice = counter++;
        switch (optionChoice) {
            case 0:
                playerPos = playerPos;
                System.out.println("The player stays in the same position");
                break;
            case 1:
                playerPos = playerPos + diceRoll;
                System.out.println("The player moves ahead");
                break;
            case 2:
                playerPos = playerPos - diceRoll;
                System.out.println("The player moves behind");
                if (playerPos <= startngPosition) {
                    playerPos = startngPosition;
                    System.out.println("The Player need to restart the game");
                } else if (playerPos == finalPosition){
                } else if (playerPos < finalPosition) {
                    playerPos = playerPos--;
                }
                while (playerPos < finalPosition) {
                    System.out.println("PLAY GAME");
                }
        }
    }
}
