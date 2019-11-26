public class Sentence {
    Word[] sentence;

    public Sentence(String sentence){
        int newlen = 0;
        for (int i = 0; i < sentence.length();newlen++) {
            for (; i < sentence.length() && new Symbol(sentence.charAt(i)).IsSplitter(); i++) ;
            for (; i < sentence.length() && !(new Symbol(sentence.charAt(i)).IsSplitter()); i++) ;
        }
        this.sentence = new Word[newlen];
        int ind = 0;
        for (int i = 0; i < newlen; i++) {

            String buff;
            buff = "";
            for (; ind < sentence.length() && new  Symbol(sentence.charAt(ind)).IsSplitter(); ind++) ;
            for (; ind < sentence.length() && !(new Symbol(sentence.charAt(ind)).IsSplitter()); ind++) {
                buff += sentence.charAt(ind);
            }
            this.sentence[i] = new Word(buff);
        }
    }

    public Word[] getSentence() {
        return sentence;
    }


    public void print(){
        for (var word :
                sentence) {
            word.print();
        }
        System.out.printf("\n");
    }

    public String task(String text){
        String[] words = text.split("[,;:.!?\\s]+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        return text.substring(0, text.indexOf(firstWord)) + lastWord + text.substring(text.indexOf(firstWord) + firstWord.length(), text.lastIndexOf(lastWord)) + firstWord + text.substring(text.lastIndexOf(lastWord) + lastWord.length());
    }


}
