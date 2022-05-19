public class Main {

    public static void main(String[] args) {

        System.out.println("Time for a challenge!!!");

        byte myValidByteValue = 10;

        short myValidShortValue = 20;

        int myValidIntValue = 50;

        long myTotalLongValue = 50000 + (10 * (myValidByteValue + myValidShortValue + myValidIntValue));

        System.out.println(myTotalLongValue);

        short myValidShortTotal = (short) (1000 + 10 *
                (myValidByteValue + myValidShortValue + myValidIntValue));

        System.out.println(myValidShortTotal);
    }
}