package com.tlglearning.cards.model;

import java.util.Objects;

public class Card implements Comparable<Card> {

  //Field Declarations. This is calling the enums Rank and Suit
  private final Rank rank;    //field declaration (modifier - private and final, Rank-type, rank-name
  private final Suit suit;    //field declaration (modifier-private and final, type-Suit, name-suit

  //Constructor created from the field declarations of rank and suit via alt+enter
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //Methods
  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, suit);  // FIXME: Move this to initialization.
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      result = (this.rank == other.rank && this.suit
          == other.suit); //you can do == with enums bc they have separate initial addresses.
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparision = this.suit.compareTo(other.suit);
    if (comparision == 0) {
      comparision = rank.compareTo(other.rank);
    }
    return comparision;
  }

}


