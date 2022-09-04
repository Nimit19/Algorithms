package SortingAlgorithms.BubbleSort;

import java.util.Scanner;

public class Q3_BestCase_WorstCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        boolean done = false;
        long start,end;

        int[] a = new int[100000];

        do {

            System.out.println();
            System.out.println("1] BestCase");
            System.out.println("2] WorstCase");
            System.out.println("3] Exit");
            System.out.print("Enter your choice : ");
            c = sc.nextInt();


            switch (c) {
                case 1 -> {
                    System.out.println("BestCase: ");
                    for (int i = 0; i < a.length; i++) {
                        a[i] = i;
                    }
                    start = System.nanoTime();
                    bubbleSort(a);
                    end = System.nanoTime();
                    System.out.println("Execution Time : " + (end - start));
                }
                case 2 -> {
                    System.out.println("WorstCase: ");
                    int d = 0;
                    for (int i = a.length - 1; i >= 0; i--) {
                        a[i] = d;
                        d++;
                    }
                    start = System.nanoTime();
                    bubbleSort(a);
                    end = System.nanoTime();
                    System.out.println("Execution Time : " + (end - start));
                }
                case 3 -> done = true;
            }

        }while (!done);

    }

    static void bubbleSort(int[] a){
        for (int i = 0; i < a.length ; i++) {
            boolean isSwapped = false;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]){
                    swap(a,i,j);
                    isSwapped = true;

                }
            }
            if(!isSwapped){
                break;

            }
        }
    }

    static void swap(int[] a,int x,int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
