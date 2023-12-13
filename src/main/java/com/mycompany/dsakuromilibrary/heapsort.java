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
public class heapsort {
    
     public void heapSort(ArrayList<Object[]> arr) {
        int n = arr.size();

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Object[] temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    
      private void heapify(ArrayList<Object[]> arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && compareBookIds(arr.get(left), arr.get(largest)) > 0) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && compareBookIds(arr.get(right), arr.get(largest)) > 0) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            Object[] swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Custom method to compare book IDs
    private int compareBookIds(Object[] a, Object[] b) {
        // Assuming book IDs are integers (column index 0)
        int idA = (int) a[0];
        int idB = (int) b[0];
        return idA - idB;
    }
}
