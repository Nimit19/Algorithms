package BinarySearch;

public class Q1_BinarySearch {
    public static void main(String[] args) {
        int[] a = {10,21,25,38,95,197,450,500};
        int target = 590;
        // only work on sorted array
        System.out.println(search(a,target));
    }

    // Ascending Order
    // return index value
    // if element not exist then return -1
    static int search(int[] a,int target){

        int start = 0;
        int end = a.length - 1;

        /*
        int mid = (start + end)/2;  // it is too large if start and end both large so it's can't store in integer
        */

        while(start <= end){

            int mid = start + (end - start) / 2; // = (2start + end - start)/2 = (start+end)/2

            if(a[mid] < target){
                start = mid + 1;
            } else if (a[mid] > target) {
                end = mid -1;
            }else {
                return mid;
            }

        }
        return  -1;
    }
}

