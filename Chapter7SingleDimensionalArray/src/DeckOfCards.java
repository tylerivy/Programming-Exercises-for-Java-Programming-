public class DeckOfCards {

    public static void main(String[] args) {
        int [] deck = new int[52];
        String [] suits = {"Spades", "Hearts", "Diamonds" , "Clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "king"};

        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        for(int i = 0; i < deck.length; i++){
            int temp = deck[i];
            int j = (int)(Math.random() * deck.length);
            deck[i] = j;
            deck[j] = temp;
        }

        for(int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + " is " + rank + " of " + suit);
        }
    }
}
