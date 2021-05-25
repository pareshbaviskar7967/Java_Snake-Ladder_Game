import java.util.Random;

public class Snake_Ladder {

    public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;

    public static void main(String[] args) {

        int playerposition = 0;
        System.out.println("The start position of player is : " + playerposition);
        Random ranval = new Random();
        int diceroll = ranval.nextInt(6) + 1;
        int check_play = ranval.nextInt(3);
        switch (check_play) {
            case No_Play:
                break;
            case Ladder:
                playerposition += diceroll;
                break;
            case Snake:
                playerposition -= diceroll;
                break;
        }
        System.out.println("After the roll dice....The position of player is : " + playerposition);

    }
}