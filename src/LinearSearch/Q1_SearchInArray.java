package LinearSearch;

import java.util.Scanner;

public class Q1_SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {5,38,197,25,95,35,51};

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int ans = search(a,n);
        System.out.println(ans); // return index if not exist the return -1
    }

    static int search(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n){
                return i;
            }
        }
        return -1;
    }
}
