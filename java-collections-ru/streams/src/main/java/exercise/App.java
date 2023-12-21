package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        List<String> allowedDomains = List.of("@gmail.com", "@yandex.ru", "@hotmail.com");
        Long result = emails.stream()
                .filter (e -> allowedDomains.stream().anyMatch(e::endsWith))
                .count();
        return result;

    }
}
// END
