package com.algorithms.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static Integer linearSearch(int[] arr, int item) {
        for(int current: arr) {
            if(item == current) {
                return item;
            }
        }
        return null;
    }

    public static int[] findEvenNumbers(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findEvenNumbers2(int[] arr) {
        return Stream.of(arr).flatMapToInt(Arrays::stream).filter(value -> value % 2 == 0).toArray();
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i =0 ; i < arr.length ;i++) {
            result[i] = arr[arr.length -1 - i ];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int search1 = 7;
        int search2 = 20;
        System.out.println(Arrays.toString(arr));
        System.out.println("Linear search for " + search1 + ", Result => " + linearSearch(arr,search1));
        System.out.println("Linear search for " + search2 + ", Result => " + linearSearch(arr,search2));

        System.out.println("Find Even Numbers");
        int[] evenNumbers = findEvenNumbers(arr);
        System.out.println(Arrays.toString(evenNumbers));

        System.out.println("Find Even Numbers 2");
        int[] evenNumbers2 = findEvenNumbers2(arr);
        System.out.println(Arrays.toString(evenNumbers2));

        System.out.println("Reverse Array");
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
