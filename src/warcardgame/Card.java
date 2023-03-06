
public class Card {
    
    private int value;
    private String name;
    
    
    public Card(int newValue, String suit) {
        value = newValue;
        
        switch(newValue) {
        case 2 -> name = "two";
        case 3 -> name = "three";
        case 4 -> name = "four";
        case 5 -> name = "five";
        case 6 -> name = "six";
        case 7 -> name = "seven";
        case 8 -> name = "eight";
        case 9 -> name = "nine";
        case 10 -> name = "ten";
        case 11 -> name = "Jack";
        case 12 -> name = "Queen";
        case 13 -> name = "King";
        case 14 -> name = "Ace";
            
        }
        
        name += " of " + suit;
    }
    
    public void describe() {
        System.out.printf("Card: %s with value of %d\n", name, value);
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}