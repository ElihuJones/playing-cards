package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {

  CLUBS('\u2663'), // Compiler makes this public stat final Suit Clubs = new Suit('\u2663');
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol; // No () therefore compiler knows this symbol is a field

  //Enum constructor. private is deleted bc it is redundant for enum constructors.
  Suit(char symbol) {
    //Assigns the enum constructor parameter 'symbol' to the field 'symbol' using this.
    this.symbol = symbol;
  }

  //Public method that is declared by the parenthesis
  //The compiler recognizes the difference between the field and the constructor BECAUSE of the ()
  public char symbol() {
    return symbol;
  }

  //IntelliJ created method to make the Override of toString() method
  @Override
  public String toString() {
    String name = name();     // No parenthesis invokes field name and with parenthesis invokes method name
    return name.charAt(0) + name.substring(1).toLowerCase();
  }


}
