package blackjackGame;

public class Card {

    String name;
    int value;
    String shape;
    boolean used = false;
    int id;
    String symbol;
    int countValue;

    public Card(int n, String s, int z) {
        if (n > 1 && n < 11) {
            if(n >= 2 && n <=6){
                this.countValue = -1;
            }else if(n >= 7 && n <= 9) {
                this.countValue = 0;
            }
            this.name = Integer.toString(n);
            this.value = n;
            this.symbol = this.name;
        } else if (n > 10) {
            this.value = 10;
            if (n == 11) {
                this.name = "Jack";
                this.symbol = "J";
                this.countValue = 1;
            } else if (n == 12) {
                this.name = "Queen";
                this.symbol = "Q";
                this.countValue = 1;
            } else if (n == 13) {
                this.name = "King";
                this.symbol = "K";
                this.countValue = 1;
            }
        } else if (n == 1) {
            this.value = 1;
            this.name = "Ace";
            this.symbol = "A";
            this.countValue = 1;
        }
        this.shape = s;
        this.id = z;
    }

    public void setUsed() {
        used = true;
    }

    public void setNotUsed() {
        used = false;
    }

}