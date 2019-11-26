
public class Symbol {
    private char symbol;
    public Symbol(){symbol = 0;}
    public Symbol(char symbol){
        this.symbol = symbol;
    }
    public void SetValue(char value){
        symbol = value;
    }

    public void print(){
        System.out.print(symbol);
    }

    public boolean IsSplitter(){
        String splitters = ",./\\()[]{}";
        return splitters.contains(String.valueOf(symbol));
    }

    public char getSymbol() {
        return symbol;
    }
}
