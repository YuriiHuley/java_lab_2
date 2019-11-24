package com.company;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int data [] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 1;

        int left = 0;
        int right = data.length-1;
        int index = -1;

        while (left <= right)
        {
            int middle = (left+right) / 2;

            if (data[middle] == numberToFind)
            {
                index = middle;
                break;
            }

            if (data[middle] < numberToFind)
            {
                right = middle - 1;
                break;
            }

            if (data[middle] > numberToFind)
            {
                left = middle + 1;
                break;
            }
        }

        System.out.println(index);
    }
}



