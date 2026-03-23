/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort;

/**
 *
 * @author jv134
 */
import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivotIndex = particion(arr, inicio, fin);
            quickSort(arr, inicio, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, fin);
        }
    }

    private static int particion(int[] arr, int inicio, int fin) {
        int pivot = arr[fin]; // Elegimos el ultimo elemento como pivote
        int i = inicio - 1;      // Indice del elemento menor

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Colocar el pivote en su posicion correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 8, 23, 33, 15};

        System.out.println("Arreglo original: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
} 