package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Comparator<Card> comparator = new Comparator<>() {              //Read as: Comparator of Card named comparator is assigned an instance of a class Comparator within

      //This method was Overridden because the class inherits an abstract class, thus won't compile if not overridden.
      @Override
      public int compare(Card card1, Card card2) {
        int comparison = card1.suit().color().compareTo(card2.suit().color());
        if (comparison == 0) {
          comparison = card1.suit().compareTo(card2.suit());      //use card1 to invoke the suit() method and us that to invoke compareTo card2 to invoke suit() method
          if (comparison == 0) {
            comparison = - card1.rank().compareTo(card2.rank());  //The -(negative) yields descending vice ascending order
          }
        }
        return comparison;
      }
    };

    Deck deck = new Deck();           //An instance of Deck.
    System.out.println(deck);         //String representation of the deck. Shrink wrap order
    Random rng = new SecureRandom();  //Creates an acceptable source of randomness.
    deck.shuffle(rng);                //Randomly shuffles the deck.
    System.out.println(deck);         //Prints out the particular instance.
    deck.sort();                      //Sorts the deck in the normal order
    System.out.println(deck);         //Shrink wrap order again
    deck.sort(comparator);      //
    System.out.println(deck);         // This is shrink wrap order but in descending order.
  }
}

