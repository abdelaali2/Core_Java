
public class Q2_WordCount {
    public static int wordCounter(String sentence, String word) {
        int counter = 0;
        String[] miniSentence = sentence.split(" ");
        for (int i = 0; i < miniSentence.length; i++) {
            if (word.equals(miniSentence[i])) {
                counter++;
            }
        }
        return counter;
    }
}
