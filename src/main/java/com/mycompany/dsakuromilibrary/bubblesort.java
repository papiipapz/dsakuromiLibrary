package com.mycompany.dsakuromilibrary;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author christinepapillero
 */
public class bubblesort {
    public void bubbleSort(ArrayList<Object[]> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String currentGenre = arr.get(j)[3].toString(); // Genre is at index 3

                // Compare genres and swap if needed
                if (compareGenres(currentGenre, arr.get(j + 1)[3].toString()) > 0) {
                    // Swap arr[j] and arr[j+1]
                    Object[] temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    // Custom method to compare genres
    private int compareGenres(String genre1, String genre2) {
        return genre1.compareToIgnoreCase(genre2);
    }
    
}
