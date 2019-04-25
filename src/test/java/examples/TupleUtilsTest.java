package examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TupleUtilsTest {
    private static Stream<Arguments> sumProvider() {
        return Stream.of(
                Arguments.of("[1; 4; 1; 4; 2; 1; 3; 5; 6; 2; 3; 7]", 4),
                Arguments.of("[3; 1; 4; 1; 5; 9; 2; 6; 5; 3; 5]", 3),
                Arguments.of("[2; 7; 1; 8; 2; 8; 1]", 2)

        );
    }

    @DisplayName("Should calculate length of longest ordered sub-sequence within array")
    @ParameterizedTest(name = "{index} => input Array is ={0},  --->>  Expected length={1}")
    @MethodSource("sumProvider")
    void testSum(String a, int b) {

        String arr[] = a.substring(1, a.length()-1).split(";");
        int[] array = Arrays.asList(arr).stream().map(String::trim).mapToInt(Integer::parseInt).toArray();

        int actualValue= TupleUtils.getMaxTupleMaxDepth(array);
        assertEquals(actualValue, b);
        }
}
