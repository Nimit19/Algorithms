package SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class Q1_CyclicSort {
    public static void main(String[] args) {

        int[] a = {5,4,3,2,1};
        cyclicSort(a);
        System.out.println("\nSorted Array: " + Arrays.toString(a));
    }

    static void cyclicSort(int[] a){

        int i = 0;
        while (i < a.length - 1 ){
            int correctIndex = a[i] - 1;
            if(a[i] != a[correctIndex]){
                 swap(a,i,correctIndex);
            }
            else {
                i++;
            }
            System.out.println("Pass: " + Arrays.toString(a));
        }
    }

     static void swap(int[] a, int i, int correctIndex) {
        int temp = a[i];
        a[i] = a[correctIndex];
        a[correctIndex] = temp;
    }
}
