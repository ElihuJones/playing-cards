package com.tlglearning.cards.strategy;

import com.tlglearning.cards.model.Card;
import java.util.Comparator;

public class ColorFirst implements Comparator<Card> {


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
}
