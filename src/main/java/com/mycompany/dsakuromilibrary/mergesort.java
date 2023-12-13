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
public class mergesort {
     public void mergeSort(ArrayList<Object[]> arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    // Helper method to merge two sorted parts
    private void merge(ArrayList<Object[]> arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        Object[][] leftArr = new Object[n1][];
        Object[][] rightArr = new Object[n2][];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr.get(low + i);
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr.get(mid + 1 + j);
        }

        int i = 0, j = 0;
        int k = low;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (leftArr[i][5].toString().compareTo(rightArr[j][5].toString()) <= 0) {
                arr.set(k, leftArr[i]);
                i++;
            } else {
                arr.set(k, rightArr[j]);
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[] if any
        while (i < n1) {
            arr.set(k, leftArr[i]);
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[] if any
        while (j < n2) {
            arr.set(k, rightArr[j]);
            j++;
            k++;
        }
    }
    
}
