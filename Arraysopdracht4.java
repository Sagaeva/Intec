package be.intecbrussel.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Arraysopdracht4 {

    public static void main(String[] args) {

         int arr[] = {23, 45, 65, 70};



         int pos1 = Arrays.binarySearch(arr, 23);
         int pos2 = Arrays.binarySearch(arr, 45);
         int pos3 = Arrays.binarySearch(arr, 65);
         int pos4 = Arrays.binarySearch(arr, 70);

        System.out.println(Arrays.toString(arr));
        System.out.println(" 23 number is plaats:\t" + pos1);
        System.out.println(" 45 number is plaats:\t" + pos2);
        System.out.println(" 65 number is plaats:\t" + pos3);
        System.out.println(" 70 number is plaats:\t" + pos4);

        int sum = 0, avrg = 0;
        for (short i = 0; i < arr.length; i++)
            sum += arr[i];
        avrg = sum/ arr.length;



        System.out.println("Gemiddel\t" + avrg);






























    }




}





 //   public static int binarySearch(Object[] a, Object key)
 //   Ищет заданный массив объектов (byte, int, double, и т.д.) для
 //   указанного значения, используя алгоритм двоичного поиска. Массив должен
 //   быть отсортирован до выполнения этого вызова. Это возвращает индекс ключа
 //   поиска, если он содержится в списке; в противном случае (-(точка вставки + 1).