package snakeladder;
import java.util.Random;
public class SnakeLadder {
    public static  final int IS_LADDER=1;
    public static final int IS_SNAKE = 2;
    public static final int IS_NO_PLAY=0;
    public static void  main(String[] args)
    {
        System.out.println("Welcome to Snake Ladder");
        int Start=1;
        Random ra=new Random();
        int Counter=0;
        while (Start!=100) {
            ++Counter;
            int Die = ra.nextInt(6) + 1;
            int Play = ra.nextInt(3);
            switch (Play) {
                case IS_LADDER:
                    if((Start+Die)<=100)
                    {
                        Start += Die;
                    }
                    System.out.println("Got Ladder Start value is "+Start);
                    break;
                case IS_SNAKE:
                    if((Start-Die)<0)
                    {
                        Start=0;
                    }
                    else
                    {
                        Start-=Die;
                    }
                    System.out.println("Snake Bites Start value "+Start);
                    break;
                default:
                    System.out.println("No Play Option Start value "+Start);
                    Start = Start;
            }
        }
        System.out.println("Start is "+Start);
        System.out.println("Total Number of Dice Was Played"+Counter);
    }

}