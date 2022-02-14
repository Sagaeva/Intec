package com.company;

import java.util.Arrays;
import java.util.Collections;

public class GetalenSorteerd {


    public static void main(String[] args) {
        int[] array = {8, 1, 6};

        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }}


            return array;
        }


    }






