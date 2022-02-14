package com.company;

public class IntArrayTools {


    public static boolean isSorted(int[] myArray) {

        for (int i = 1; i < myArray.length; i++) {

            if (myArray[i-1] < myArray[i]) {
                return true;
            }

        }


        return false;
    }
}
