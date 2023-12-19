package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> data = List.of(1,2,4,5,6,7,8);

        List<Integer> expected =List.of(1,2,4);
        List<Integer> actual = App.take(data, 3);
        assertThat(expected).isEqualTo(actual);

        List<Integer> expected1 = Collections.emptyList();
        List<Integer> actual1 = App.take(data, 0);
        assertThat(expected1).isEqualTo(actual1);

        List<Integer> expected2 = List.of(1,2,4,5,6);
        List<Integer> actual2 = App.take(data, 5);
        assertThat(expected2).isEqualTo(actual2);

        // END
    }
}
