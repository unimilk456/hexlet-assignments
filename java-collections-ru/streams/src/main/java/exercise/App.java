package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        Long result = emails.stream()
                .filter(mail -> (mail.contains("@gmail.com")
                        || mail.contains("@yandex.ru")
                        || mail.contains("@hotmail.com")))
                .count();
        return result;

    }
}
// END
