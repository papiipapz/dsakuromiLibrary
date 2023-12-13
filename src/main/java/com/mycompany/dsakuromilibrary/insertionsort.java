/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

/**
 *
 * @author christinepapillero
 */
import java.util.ArrayList;

public class insertionsort{

    // Insertion sort implementation for sorting by title
    public void insertionSort(ArrayList<Object[]> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Object[] key = arr.get(i);
            int j = i - 1;

            // Extract the title from the current key
            String keyTitle = key[1].toString();

            // Compare titles and perform insertion sort
            while (j >= 0 && compareTitles(arr.get(j)[1].toString(), keyTitle) > 0) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    // Custom method to compare titles
    private int compareTitles(String title1, String title2) {
        return title1.compareToIgnoreCase(title2);
    }
}