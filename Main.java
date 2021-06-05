package com.haziminyo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 7, 3, 9, 5, 2, 4, 1, 5, 8, 10, 6 };
        var sorter = new MergeSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
     }

    }
