<<<<<<< HEAD
//comment1
=======
//comment
>>>>>>> 2c2460116152b6a3b39900b65ef4e201f018b031
package vevana;

public class Card {
    private String value;
    private String symbol;
    private int point;

    public Card(String value, String symbol, int point) {
        this.value = value;
        this.symbol = symbol;
        this.point = point;
    }

    public String getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Card{" + "value=" + value + ", symbol=" + symbol + ", point=" + point + '}';
    }
    
    
}
