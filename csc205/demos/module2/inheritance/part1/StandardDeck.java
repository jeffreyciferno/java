package com.csc205.demos.module2.inheritance.part1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Ray Hedgecock on 4/7/2017.
 * <p>
 * This could benefit from using an abstract class as there are a lot of common method implementations between deck types.
 * Ran out of time to implement abstract class.
 *
 * @author Ray Hedgecock
 * @since 1.0.0
 */
public class StandardDeck implements Deck, Serializable{

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    /**
     * Shuffles this deck of cards.
     */
    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

    /**
     * Quick and dirty way to do a split.  There are more elegant ways using partitions and generics.
     *
     * @param index index
     */
    @Override
    public void cut(int index) {

        List<Card> top = this.cards.subList(0, this.cards.size() / 2);
        List<Card> bottom = this.cards.subList(this.cards.size() / 2 + 1, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }

    /**
     * Removes the card at the top.
     *
     * @return card
     */
    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    /**
     * Gets the card at the top without removing it.
     *
     * @return card
     */
    @Override
    public Card turnOver() {
        return this.cards.get(0);
    }

    /**
     * Returns the index of the given card.
     *
     * @param card card
     * @return index of card
     */
    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    /**
     * This method works because the cards are comparable.
     * Sort order is determined by the ordinality of the two
     * enums used for the cards suit and face values.
     *
     * @param cards card deck to order
     */
    @Override
    public void newOrder(Deck cards) {
        Collections.sort(this.cards);
    }

    /**
     * Generates new unshuffled deck of cards.
     *
     * @return deck of cards
     */
    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                newDeck.add(new Card(suit, faceValue));
            }
        }
        return newDeck;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StandardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
