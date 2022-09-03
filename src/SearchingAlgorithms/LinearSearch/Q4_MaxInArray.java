package SearchingAlgorithms.LinearSearch;

import java.util.Scanner;

public class Q4_MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {5,38,197,25,95,35,51};

        System.out.println(max(a));
        System.out.println(min(a));
    }

    static int max(int[] a) {
        int max = a[0];
        for (int element : a) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int element : a) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}
