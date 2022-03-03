package com.blz.OOPSPrograming;

public class Cards {
    public static int[] deck = new int[52];
    public static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public void initializeCards() {
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public void shuffleCards() {
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }


    public void displayCards() {
        String suit;
        String rank;
        for (int i = 0; i < 9; i++) {
            suit = suits[deck[i] / 13];
            rank = ranks[deck[i] % 13];
            System.out.println(rank +" "+ "of"+" "+suit);
        }
    }
}
