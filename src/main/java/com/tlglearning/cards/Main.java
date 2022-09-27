package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.strategy.ColorFirst;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();           //An instance of Deck.
    System.out.println(deck);         //String representation of the deck. Shrink wrap order
    Random rng = new SecureRandom();  //Creates an acceptable source of randomness.
    deck.shuffle(rng);                //Randomly shuffles the deck.
    System.out.println(deck);         //Prints out the particular instance.
    deck.sort();                      //Sorts the deck in the normal order
    System.out.println(deck);         //Shrink wrap order again
    deck.sort(new ColorFirst());      //
    System.out.println(deck);         // This is shrink wrap order but in descending order.





  }

}
