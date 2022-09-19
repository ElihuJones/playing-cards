package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();           //An instance of Deck.
    System.out.println(deck);         //String representation of the deck.
    Random rng = new SecureRandom();  //Creates an acceptable source of randomness.
    deck.shuffle(rng);                //Randomly shuffles the deck.
    System.out.println(deck);         //Prints out the particular instance.




  }

}
