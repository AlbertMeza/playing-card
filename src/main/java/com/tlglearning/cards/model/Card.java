package com.tlglearning.cards.model;

public class Card implements Comparable<Card>{
  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank rank(){
    return rank;
  }

  public Suit suit(){

    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  public int compareTo(Card other){
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0){
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }


  @Override
  public boolean equals(Object obj) {
    boolean result;

    if (this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      result = (this.rank == other.rank && this.suit == other.suit);
    } else {
      result = false;
    }
    return result;
  }



  //TODO overide equals
  //TODO override hashCode
}
