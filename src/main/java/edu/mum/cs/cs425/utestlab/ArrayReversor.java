package edu.mum.cs.cs425.utestlab;

import java.util.stream.IntStream;

class ArrayReversor {

    /**
     * This is the same ArrayFlatternerService class instance
     */
    private final ArrayFlattener flattenerService;

    ArrayReversor(ArrayFlattener flattenerService) {
        this.flattenerService = flattenerService;
    }

    int[] reverseArray(int[][] input) {
        int[] a = this.flattenerService.flattenArray(input);
        return IntStream.range(0, a.length)
                .map(i -> a[a.length - 1 - i])
                .toArray();
    }
}
