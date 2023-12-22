package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

// BEGIN
class App {
    public static String getForwardedVariables(String file) {
        String[] arr = file.split("\n");

        return Arrays.stream(arr)
                        .filter(el  -> el.startsWith("environment="))
                        .map(el -> el.replace("environment=", ""))
                        .flatMap(App::processSingleLine)
                        .collect(Collectors.joining(","));

    }
    public static Stream<String> processSingleLine(String str) {
        String[] arr = str.split(",");
        return stream(arr)
                .map(el -> el.replaceAll("\"", ""))
                .flatMap(App::processInsideSingleLine);
    }
    public static Stream<String> processInsideSingleLine(String str) {

        String[] arr = str.split(",");
        return Arrays.stream(arr)
                .filter(el -> el.startsWith("X_FORWARDED_"))
                .map(el -> el.replace("X_FORWARDED_", ""));
    }
}
//END
