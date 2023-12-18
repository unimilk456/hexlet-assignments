package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class App {
    public static Map<String, Integer>  getWordCount(String text) {
        if (text == "") {
            return Collections.emptyMap();
        }
        String[] arr = text.split(" ");
        List<String> words = Arrays.asList(arr);
        Map<String, Integer> newMap = words.stream()
                .map(el -> el.toLowerCase())
                .collect(Collectors.groupingBy(word -> word, summingInt(x -> 1)));
        return newMap;
    }

    public static String toString(Map<String, Integer> words) {
        if (words.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> word: words.entrySet()) {
            result.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        };
       // System.out.println("RESULT ======= "+result);
        return result.toString()+"}\n";
    }
}
// BEGIN

//END
