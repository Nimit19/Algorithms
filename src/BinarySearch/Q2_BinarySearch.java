package BinarySearch;

public class Q2_BinarySearch {
    public static void main(String[] args) {
        int[] a = {256,200,197,80,65,55,38,8,3,0,-18,-25};
        int target = -18;
        // only work on sorted array
        System.out.println(search(a,target));
    }
    // Descending Order
    // return index value
    // if element not exist then return -1
    static int search(int[] a,int target){

        int start = 0;
        int end = a.length - 1;

        /*
        int mid = (start + end)/2;  // it is too large if start and end both large so it's can't store in integer
        */

        while(start <= end){

            int mid = start + (end - start) / 2 ; // = (2start + end - start)/2 = (start+end)/2

            if(a[mid] > target){
                start = mid + 1;
            } else if (a[mid] < target) {
                end = mid -1;
            }else {
                return mid;
            }

        }
        return  -1;
    }
}

