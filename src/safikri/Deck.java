/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safikri;

import java.util.List;
import elevengame.DataStore;
import java.util.ArrayList;
import java.util.Collections;
import safikri.Card;

/**
 *
 * @author sarka
 */
public class Deck {

    private List<Card> deckList;                        //Deck of cards not played yet
    private List<Card> playedDeckList;                  //Garbage deck of cards
    private String[] values = DataStore.loadValues();
    private String[] symbols = DataStore.loadSymbols();
    final private int N = 52;                           //Number of cards in a deck

    public Deck() {
        deckList = new ArrayList<>();
        for (int i = 0; i < (getPermts().length); i++) {
            deckList.add(Card.getByFactory(getPermts()[i]));
        }
        playedDeckList=new ArrayList<>();
    }

    public void shuffle() {
        Collections.shuffle(deckList);
    }

    public Card draw() {
        Card c=deckList.get(0);
        playedDeckList.add(c);
        deckList.remove(0);
        return c;
    }

    private String[][] getPermts(){
        String[][] permts = new String[N][2];
        for (int j = 0; j < symbols.length; j++) {
            for (int i = 0; i < values.length; i++) {
                permts[j * 13 + i][0] = values[i];
                permts[j * 13 + i][1] = symbols[j];
            }
        }
        return permts;
    }

    public int getSize(){
        return deckList.size();
    }
    
   
    public static void main(String[] args) {
        Deck d = new Deck();
        String[][] permts = d.getPermts();
        for (String[] array : permts) {
            System.out.format("%s %s, ", array[0], array[1]);
        }
        System.out.println("");
        for (Card c : d.deckList) {
            System.out.print(c.toString());
        }
        d.shuffle();
        System.out.println("");
        for (Card c : d.deckList) {
            System.out.print(c.toString());
        }
        System.out.println("");
        Card a=d.draw();
        System.out.println(a.toString());
        System.out.println("");
        for (Card c : d.deckList) {
            System.out.print(c.toString());
        }
    }

}
