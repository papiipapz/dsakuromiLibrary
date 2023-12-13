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
public class selectionsort {
 
   public void selectionSort(ArrayList<Object[]> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Extract titles for comparison
                String objAtIndexJ = arr.get(j)[2].toString();
                String objAtMinIndex = arr.get(minIndex)[2].toString();

                // Compare obj to find the minimum
                if (objAtIndexJ.compareToIgnoreCase(objAtMinIndex) < 0) {
                    minIndex = j;
                }
            }
            // Swap elements
            Object[] temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }
    }
}
