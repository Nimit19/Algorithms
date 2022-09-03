package SortingAlgorithms.BubbleSort;

import java.util.Arrays;

// Must Check GeekFoGeeks

public class Q1_BubbleSort {
    public static void main(String[] args) {
//        int[] a = {45,25,20,18,16,12,8,0};
//        int[] a = {38,45,19,7,25};
        int[] a = {-25,-56,0,56,-42,96,-29};

        System.out.println(Arrays.toString(a));
        m1_BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    // it's sort in largest value last
    static void m2_BubbleSort(int[] a){

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if(a[j] < a[j - 1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
    // it's sort in lowest value first
    static void m1_BubbleSort(int[] a){

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
}
