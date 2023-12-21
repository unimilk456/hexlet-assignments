package exercise;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testDoubleMatrix() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "", "", "", "", "*", "*"},
                {"*", "*", "", "", "", "", "*", "*"},
                {"*", "*", "", "", "", "", "*", "*"},
                {"*", "*", "", "", "", "", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] actualArray = App.enlargeArrayImage(image);
        assertThat(Arrays.deepToString(actualArray).equals(Arrays.deepToString(expected)));
    }
}

// END
