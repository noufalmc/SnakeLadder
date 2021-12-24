package snakeladder;
import java.util.Random;
public class SnakeLadder {
    public static  final int IS_LADDER=1;
    public static final int IS_SNAKE = 2;
    public static final int IS_NO_PLAY=0;
    public static void  main(String[] args)
    {
        System.out.println("Welcome to Snake Ladder");
        int Start=0;
        Random ra=new Random();
        int Die=ra.nextInt(6)+1;
        int Play=ra.nextInt(3);
        switch (Play)
        {
            case IS_LADDER:
                Start+=Die;
                System.out.println("Got Ladder");
                break;
            case IS_SNAKE:
                Start-=Die;
                System.out.println("Snake Bites");
                break;
            default:
                System.out.println("No Play Option");
                Start=Start;
        }
        System.out.println("Start is "+Start);
    }

}