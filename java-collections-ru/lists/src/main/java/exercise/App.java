package exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static boolean scrabble(String text, String word) {
        if ((text.length() == 0) || (word.length() == 0)) {
            return false;
        }
        String[] wordAsArray = word.split("");
        List<String> textArr = new ArrayList<>(Arrays.asList(text.split("")));
        textArr = textArr.stream()
                .map(el -> el.toLowerCase()).
                collect(Collectors.toList());
        for (String symbol : wordAsArray) {
            if (textArr.contains(symbol.toLowerCase())) {
                textArr.remove(symbol);
                continue;
            }
            return false;
        }
        return true;
    }
}
//END
