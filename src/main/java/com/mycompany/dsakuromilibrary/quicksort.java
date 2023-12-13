/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

import java.util.ArrayList;

/**
 *
 * @author christinepapillero
 */
public class quicksort {
     public void quickSort(ArrayList<Object[]> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Helper method for partitioning in Quicksort
    private int partition(ArrayList<Object[]> arr, int low, int high) {
        String pivot = arr.get(high)[4].toString(); // Using column index 4 for "Date Published"
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j)[4].toString().compareTo(pivot) < 0) {
                i++;

                // Swap arr[i] and arr[j]
                Object[] temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Swap arr[i+1] and arr[high] (pivot element)
        Object[] temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }
    
}
