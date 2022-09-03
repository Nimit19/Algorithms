package SearchingAlgorithms.BinarySearch;

public class Q6_BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] a = {10,21,25,38,95,197,450,500};
        int target = -95;
        // only work on sorted array
        System.out.println(search(a,target,0,a.length - 1));
    }

    static int search(int[] a,int target,int start,int end ){

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if(a[mid] == target)
            return mid;

        if(a[mid] < target)
            return search(a,target,mid + 1,end);
        else
            return search(a,target,start,mid - 1);

    }
}
