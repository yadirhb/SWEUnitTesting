package edu.mum.cs.cs425.utestlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Implements requirements for Q3.
 */
class ArrayFlattenerTest {
    ArrayFlattener flattener;

    @BeforeEach
    void setUp() {
        flattener = new ArrayFlattener();
    }

    @Test
    void flattenArrayTestNormal2DArray() {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};

        int[] a_out = {1, 3, 0, 4, 5, 9};

        assertArrayEquals(a_out, flattener.flattenArray(a_in));
    }

    @Test
    void flattenArrayTestNullArray() {
        int[] a_out = {};
        assertArrayEquals(a_out, flattener.flattenArray(null));
    }
}