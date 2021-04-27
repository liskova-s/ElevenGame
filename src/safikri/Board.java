/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safikri;

import elevengame.DataStore;
import java.util.List;

/**
 *
 * @author sarka
 */
public class Board {

    private int cardNum = DataStore.getNCards();
    private Card[] board;
    private Deck deck;

    public Board(Deck deck) {
        this.deck = deck;
        board = new Card[cardNum];
        prepareBoard();
    }

    private Card[] prepareBoard() {
        Card[] prep = new Card[cardNum];
        deck.shuffle();
        for (int i = 0; i < cardNum; i++) {
            prep[i] = deck.draw();
        }
        return prep;
    }

    public Card getCardAt(int inx) {
        return board[inx];
    }

    public boolean triplePresent() {
        boolean J = false;
        boolean Q = false;
        boolean K = false;
        for (Card c : board) {
            switch (c.getValue()) {
                case "king":
                    K = true;
                    break;
                case "queen":
                    Q = true;
                    break;
                case "jack":
                    J = true;
                    break;
                default:
                    break;
            }
        }
        if (J && Q && K) {
            return true;
        }
        return false;
    }

    public boolean elevenPresent() {
        
    }

}
