package BinarySearch;

public class Q3_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] a = {256,200,197,80,65,55,38,8,3,0,-18,-25};
        int[] a = {-18,10,21,25,38,95,197,450,500};
        int target = 95;

        // only work on sorted array
        System.out.println(search(a,target));

    }
    static int search(int[] a,int target){
        int start = 0;
        int end = a.length -1;

        boolean isAce = a[start] < a[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(a[mid] == target){
                return mid;
            }

            if(isAce){
                if(a[mid]<target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }else{
                if(a[mid]<target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return  -1;
    }
}
