package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] arr) {

        String[][] horizontalyStretched = Arrays.stream(arr)
                .map(App::duplicateValues)
                .toArray(String[][]::new);

        return Arrays.stream(horizontalyStretched)
                .flatMap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(String[][]::new);
    }

    public static String[] duplicateValues(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(e -> Arrays.stream(new String[]{e, e}))
                .toArray(String[]::new);
    }
}
// END
