package com.hendisantika.demo.MergeSort;

/**
 * Created by IntelliJ IDEA.
 * Project : data-structure-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-21
 * Time: 06:15
 */
public class MergeWithAuxArray {

    public static void main(String[] args) {
        int[] arr = {9, 123, 17, 555};
        MergeWithAuxArray mergeWithAuxArray = new MergeWithAuxArray();
        mergeWithAuxArray.merge(arr);
    }

    void merge(int[] arr) {
        int size = arr.length / 2;

        int[] aux = new int[size];

        for (int i = 0; i < size; i++) {
            aux[i] = arr[i];
            arr[i] = 0;
        }

        int i = 0, j = 0, k = size;

        while (i < aux.length && k < arr.length) {

            if (aux[i] <= arr[k]) {
                arr[j] = aux[i];
                aux[i] = 0;
                j++;
                i++;

            } else {
                arr[j] = arr[k];
                arr[k] = 0;

                k++;
                j++;

            }
        }

        if (i <= aux.length) {
            if (i != 0)
                k = k - i + 1;
            else
                k = k - aux.length;

            System.arraycopy(aux, i, arr, k, aux.length - i);
        }

        printArr(arr);
        printArr(aux);

    }

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}