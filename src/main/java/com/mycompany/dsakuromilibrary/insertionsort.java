/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

/**
 *
 * @author christinepapillero
 */
public class insertionsort {
    
    
     public static void insertionSort(Object[][] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Object[] key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && compare(arr[j][0], key[0]) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

     public static int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String) {
            String str1 = (String) o1;
            String str2 = (String) o2;
            return str1.compareTo(str2);
        }
        return 0; // Return a default value or handle other types accordingly
    }
}
     
     

