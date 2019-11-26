public class Word {
    private Symbol[] word;

    public Word(String word) {
        int length = word.length();
        this.word = new Symbol[length];
        for (int i = 0; i < length; i++) {
            this.word[i] = new Symbol(word.charAt(i));
        }
    }

    public Word(Word other){
        this.word = other.getWord();
    }

    public void print(){
        for (Symbol i :
                word) {
            i.print();
        }
        System.out.print(" ");
    }


    public Symbol[] getWord() {
        return word;
    }
}
