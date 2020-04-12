public class DeckCards {
    public static void main(String[] args) {
        String[] suit = {"clubs", "spades", "hearts", "diamonds"};
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
            "Q", "K", "A" };

        String[] deck = new String[52];

        for (int j=0; j<suit.length; j++) {
            for (int i=0; i<rank.length; i++) {
                deck[i + 13*j] = rank[i] + " of " + suit[j];
            }
        }

        for (String v: deck) {
            System.out.println(v);
        }
    }
}
