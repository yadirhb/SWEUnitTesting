package edu.mum.cs.cs425.utestlab;

import java.util.Arrays;

public class Main {
    private static ArrayFlattener flattener = new ArrayFlattener();

    public static void main(String[] args) {
        // write your code here
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        System.out.println("The expected output: [1, 3, 0, 4, 5, 9]");
        System.out.println(Arrays.toString(Main.flattener.flattenArray(a_in)));
    }
}
