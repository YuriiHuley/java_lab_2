package com.company;

public class ArraySort {

    public static void main(String[] args) {

        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        boolean isSorted = false;
        int x;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                }
            }
        }

        for (int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
