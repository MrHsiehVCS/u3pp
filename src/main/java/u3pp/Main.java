package u3pp;

public class Main 
{
    public static void main(String[] args) {
        
        // Use this space to test your code, or actually run your project
        System.out.println("\n\nHi! This is an empty project.\nYour code will start running from Main.java.\nIt may be daunting to start a project from scratch, but try to have fun with it! :)\n");

        Deck d = new Deck();
        d.shuffle();
        System.out.println(d);
        System.out.println();
        for(int i = 0; i < 51; i++) {
            twoCards(d.cards[i], d.cards[i+1]);
        }
        
    }

    public static void twoCards(Card c, Card d) {
        System.out.println(String.format("%s vs. %s returns %d. Inverse returns %d", c, d, c.compareTo(d), d.compareTo(c)));
    }
}
