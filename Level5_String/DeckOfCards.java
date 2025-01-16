import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define the suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Create and initialize the deck
        String[] deck = initializeDeck(suits, ranks);
        
        // Shuffle the deck
        shuffleDeck(deck);
        
        // Input number of players and cards to distribute
        System.out.print("Enter the number of players: ");
        int x = sc.nextInt();
        
        int n = 52; // Total cards in the deck
        if (n % x != 0) {
            System.out.println("The cards cannot be distributed evenly.");
            return;
        }
        
        // Distribute the deck to players
        String[][] players = distributeCards(deck, n, x);
        
        // Print the cards each player has
        printPlayersCards(players);
        
        sc.close();
    }

    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate a random number between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck to x players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " has the following cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
