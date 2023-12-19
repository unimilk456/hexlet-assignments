package exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {

        List<Map<String, String>> filtered = books.stream()
                .filter(m -> m.entrySet().containsAll(where.entrySet()))
                .collect(Collectors.toList());

        return filtered;
    }
}
//END
