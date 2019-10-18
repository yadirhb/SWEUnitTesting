package edu.mum.cs.cs425.utestlab;

import java.util.Arrays;
import java.util.Optional;

class ArrayFlattener {
    /**
     * Flattens the input array. Never returns null or exception.
     *
     * @param input A 2D int array.
     * @return The flattened array or empty.
     */
    int[] flattenArray(int[][] input) {
        return Optional.ofNullable(input).isPresent() ? Arrays.stream(input).flatMapToInt(Arrays::stream).toArray() : new int[0];
    }
}
