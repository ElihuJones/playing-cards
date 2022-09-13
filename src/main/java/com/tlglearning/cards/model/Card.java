package com.tlglearning.cards.model;

public class Card {

  //Field Declarations. This is calling the enums Rank and Suit
  private final Rank rank;    //field declaration (modifier - private and final, Rank-type, rank-name
  private final Suit suit;    //field declaration (modifier-private and final, type-Suit, name-suit

//Constructor created from the field declarations of rank and suit via alt+enter
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //Methods
  public Rank Rank() {
    return rank;
  }

  public Suit Suit() {
    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  //todo: override equals method

  //todo: override hashcode method
}


