package edu.mum.cs.cs425.utestlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

/**
 * Implements requirements for Q4.
 */
class ArrayReversorTest {
    private ArrayFlattener flattenerMock = mock(ArrayFlattener.class);
    private ArrayReversor reversor;

    @BeforeEach
    void setUp() {
        reversor = new ArrayReversor(flattenerMock);
    }

    @Test
    void reverseArrayNormalArray() {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        int[] a_out = {9, 5, 4, 0, 3, 1};
        when(flattenerMock.flattenArray(a_in)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        assertArrayEquals(a_out, reversor.reverseArray(a_in));

        verify(flattenerMock).flattenArray(a_in);
    }

    @Test
    void reverseArrayNullArray() {
        int[] a_out = {};
        when(flattenerMock.flattenArray(null)).thenReturn(new int[0]);
        assertArrayEquals(a_out, reversor.reverseArray(null));

        verify(flattenerMock).flattenArray(null);
    }
}