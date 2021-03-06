package binary_search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearch704Test {

    private final BinarySearch704 java = new BinarySearch704();

    private final BinarySearchKotlin704 kotlin = new BinarySearchKotlin704();

    @ParameterizedTest
    @MethodSource("source")
    void search(int[] nums, int target, int result) {
        assertEquals(result, java.search(nums, target));
    }

    @ParameterizedTest
    @MethodSource("source")
    void searchKotlin(int[] nums, int target, int result) {
        assertEquals(result, kotlin.search(nums, target));
    }

    private static Stream<Arguments> source() {
        int[] intArray = {-1, 0, 3, 5, 9, 12};
        return Stream.of(
                Arguments.of(intArray, 9, 4),
                Arguments.of(intArray, 2, -1)
        );
    }
}
