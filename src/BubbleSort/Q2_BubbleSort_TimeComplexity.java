package BubbleSort;

import java.util.Arrays;

public class Q2_BubbleSort_TimeComplexity {
    public static void main(String[] args) {
        int[] a = {-25,0,56,-42,96,-29,38};

//        int[] a = {1,2,3,4,5};

        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubbleSort(int[] a){

        for (int i = 0; i < a.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < a.length - i; j++) {
                if(a[j] < a[j - 1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

    }
}
