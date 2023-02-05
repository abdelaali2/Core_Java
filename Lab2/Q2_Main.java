
public class Q2_Main {
    public static void main(String[] args) {
        String sentence = args[0];
        String word = args[1];
        Q2_WordCount toBeCheckedSentence = new Q2_WordCount();
        System.out.print(toBeCheckedSentence.wordCounter(sentence, word));
    }
}
