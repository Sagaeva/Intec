package be.intecbrussel.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayApp {

    public static void main(String[] args) {

        int[] arr = {1, 6, 9, 222, 2, -3, 26};
        int arrzondersort = arr[0];
        System.out.println("Origineel volgorde is:" + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Gesorteerde volgorde is:" + Arrays.toString(arr));
        int arrmetsort = arr[0];

        boolean isDone = arrzondersort != arrmetsort;

        System.out.println(isDone);


        // opdracht 2

        Integer[] arr2 = {3, 6, 9, -5, 100, 324, 7};

        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i = 0; i < arr2.length; i++) {

        }
        System.out.println("Omgekeerde volgorde\t" + Arrays.toString(arr2));









        }



                }












