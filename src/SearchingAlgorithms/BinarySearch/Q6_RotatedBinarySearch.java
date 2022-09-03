package SearchingAlgorithms.BinarySearch;

public class Q6_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] a = {10,21,25,38,1,2,5,6,7,8,9};
        int target = 5;
        // only work on sorted array
        System.out.println(rotatedBinarySearch(a,target,0 ,a.length - 1 ));
    }
    static int rotatedBinarySearch(int[] a, int target,int s,int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e - s)/2;

        if(a[mid] == target){
            return mid;
        }

        if(a[s] <= a[mid]){
            if(target >= a[s] && target <= a[mid]){
                return rotatedBinarySearch(a,target,s,mid - 1);
            }else{
                return rotatedBinarySearch(a,target,mid + 1,e);
            }
        }

        if(target >= a[mid] && target <= a[e]){
            return rotatedBinarySearch(a,target,mid+1,e);
        }
        return rotatedBinarySearch(a,target,s,mid - 1);

    }
}
