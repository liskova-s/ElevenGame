/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safikri;

import elevengame.GameInterface;
import java.util.List;

/**
 *
 * @author sarka
 */
public class ElevenGame implements GameInterface {
    private Deck gameDeck;
    private Board gameBoard;
    private String name="♦ ♠ Eleven Game ♣ ♥";
    private int nOfCards=9;
  
    public ElevenGame(){
        gameDeck=new Deck();
        gameBoard=new Board(gameDeck);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int nCards() {
       return nOfCards;
    }

    @Override
    public int getDeckSize() {
        return gameDeck.getSize();
    }

    @Override
    public String getCardDescriptionAt(int index) {
        return gameBoard.getCardAt(index).toString();
    }

    @Override
    public boolean anotherPlayIsPossible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean playAndReplace(List<Integer> iSelectedCards) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
