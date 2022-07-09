package LinearSearch;

import java.util.Scanner;

public class Q3_SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {5,38,197,25,95,35,51};

        int target = 38;
        int start = 1;
        int end = 4;

        int ans = search(a,target,start,end);
        System.out.println(ans); // return index if not exist the return -1
    }

    static int search(int[] a, int n,int start,int end) {
        for (int i = start; i < end; i++) {
            if(a[i] == n){
                return i;
            }
        }
        return -1;
    }
}


