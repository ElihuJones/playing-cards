package com.tlglearning.cards.model;

public enum Rank {

  ACE("A"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

  private final String symbol;

  //Constructor using String symbol argument
  Rank(String symbol) {
    this.symbol = symbol;
  }

  //This could getSymbol. Very simple accessors
  public String symbol() {
    return symbol;
  }

  @Override
  public String toString() {
    String name = name();     // No parenthesis invokes field name and with parenthesis invokes method name
    return name.charAt(0) + name.substring(1).toLowerCase();
  }
}
