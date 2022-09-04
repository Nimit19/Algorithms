package SortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class Q4_BubbleSort {
    public static void main(String[] args) {
        int[] a = {25,56,42,96,0,38};
        long start,end;

        start = System.nanoTime();
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < a.length; i++) {
            c1 += 1;
            boolean isSwapped = false;
            for (int j = i + 1; j < a.length; j++) {
                c2 += 1;
                if(a[i] > a[j]){
                    c3 += 1;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    isSwapped = true;
                }
            }
            System.out.println("Pass " + c1 +": "+ Arrays.toString(a));
            if(!isSwapped){
                break;
            }
        }
        end = System.nanoTime();
        System.out.println();

        System.out.println("Sorted Array : " + Arrays.toString(a));
        System.out.println("Outer Loop : " + c1);
        System.out.println("Inner Loop : " + c2);
        System.out.println("If Statement : " + c3);
        System.out.println("Execution Time : " + (end - start));
    }

}
