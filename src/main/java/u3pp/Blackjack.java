package u3pp;

import java.util.Scanner;

// MVP Version. play() not implemented.
public class Blackjack {
    

    public Blackjack() {

    }

    public void play(Scanner scanner) {

    }

    private static int getScore(Card c) {
        String value = c.getValue().toLowerCase();
        if(value.equals("ace")) {
            return 11;
        }
        if(value.equals("king") || value.equals("queen") || value.equals("jack")) {
            return 10;
        }
        return Integer.valueOf(value);
    }

    public static int calcPoints(Card[] hand) {
        int runningTotal = 0;
        for(Card c : hand) {
            runningTotal += getScore(c);
        }
        return runningTotal;
    }

    //`"User Wins"`, `"User Loses"`, or `"User Pushes"`
    public static String determineResult(Card[] userHand, Card[] dealerHand) {
        int userScore = calcPoints(userHand);
        int dealerScore = calcPoints(dealerHand);

        if(userScore > dealerScore) {
            return "User Wins";
        }
        if (userScore == dealerScore) {
            return "User Pushes";
        }
        return "User Loses";
    }

    public static boolean isBust(Card[] hand) {
        return calcPoints(hand) > 21;
    }

    public static boolean isBlackjack(Card[] hand) {
        return hand.length == 2 && calcPoints(hand) == 21;
    }

    public static boolean shouldDealerKeepHitting(Card[] hand) {
        return calcPoints(hand) < 17;
    }
}
