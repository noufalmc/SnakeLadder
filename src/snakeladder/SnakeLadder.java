package snakeladder;
import java.util.Random;
public class SnakeLadder {
    public static  final int IS_LADDER=1;
    public static final int IS_SNAKE = 2;
    public static final int IS_NO_PLAY=0;
    public static void  main(String[] args)
    {
        System.out.println("Welcome to Snake Ladder");
        int Start1=0;
        int Start2=0;
        Random ra=new Random();
        int Counter1=0;
        int Counter2=0;
        int Repeat=0;
        int i=0;
        while(Start1<100 && Start2<100)
        {
            Repeat=1;
        while (Start1!=100 && Start2!=100 && Repeat!=0) {
            int Die = ra.nextInt(6)+1;
            int Play = ra.nextInt(3);
            if(i%2==0) {
                ++Counter1;
                switch (Play) {
                    case IS_LADDER:
                        Repeat=1;
                        if ((Start1 + Die) <= 100) {
                            Start1 +=Die;
                        }
                        System.out.println("Got Ladder Start1 value is " + Start1);
                        break;
                    case IS_SNAKE:
                        Repeat=0;
                        if ((Start1 - Die) < 0) {
                            Start1 = 0;
                        } else {
                            Start1-= Die;
                        }
                        System.out.println("Snake Bites Start1 value " + Start1);
                        break;
                    default:
                        Repeat=0;
                        System.out.println("No Play Option Start1 value " + Start1);
                        Start1 = Start1;
                }
            }
            else
            {
                ++Counter2;
                switch (Play) {
                    case IS_LADDER:
                        Repeat=1;
                        if ((Start2 + Die) <= 100) {
                            Start2 += Die;
                        }
                        System.out.println("Got Ladder Start2 value is " + Start2);
                        break;
                    case IS_SNAKE:
                        Repeat=0;
                        if ((Start2 - Die) < 0) {
                            Start2=0;
                        } else {
                            Start2-=Die;
                        }
                        System.out.println("Snake Bites Start2 value " + Start2);
                        break;
                    default:
                        Repeat=0;
                        System.out.println("No Play Option Start2 value " + Start2);
                        Start2 = Start2;
                }
            }
            System.out.println("Start1= " + Start1);
            System.out.println("Start2= " + Start2);
        }
            ++i;
        }
        if(Start1>Start2)
        {
            System.out.println("**********************************************************" +
                    "CONGRATULATIONS" +
                    "*********************************************************************");
            System.out.println("Person1 winner of The Game" + Start1);
            System.out.println("**********************************************************" +
                    "***********" +
                    "*********************************************************************");
        }
        else
        {
            System.out.println("**********************************************************" +
                    "CONGRATULATIONS" +
                    "*********************************************************************");
            System.out.println("Person2 winner of The Game" + Start2);
            System.out.println("**********************************************************" +
                    "***************" +
                    "*********************************************************************");
        }
        System.out.println("**********************************************************" +
                "CONGRATULATIONS" +
                "*********************************************************************");
        System.out.println("Person1 Dice Thrown " +Counter1+" Score "+Start1);
        System.out.println("Person2 Dice Thrown " +Counter2+" Score "+Start2);
        System.out.println("**********************************************************" +
                "***************" +
                "*********************************************************************");
    }

}