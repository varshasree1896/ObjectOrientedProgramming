package com.blz.OOPSPrograming;

public class DeckofCards {
    public static void main(String[] args) {
        Cards card = new Cards();
        card.initializeCards();
        card.shuffleCards();
        card.displayCards();
    }

}
