package LinearSearch;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {

        int[] a = {10,20,25,38,197,156,95};
        int target = 197;
        int index = 0;
        System.out.println(linearSearch(a,target,index));
        System.out.println(find(a,target,index));

    }

    // 2]
    static boolean find(int[] a, int target, int index) {
        if(index == a.length - 1){
            return false;
        }

        return (a[index] == target) || find(a,target,index + 1);
    }

    // 1]
    static int linearSearch(int[] a, int target, int index) {
        if(index == a.length - 1){
            return -1;
        }

        if(a[index] == target){
            return index;
        }
        return linearSearch(a,target,index + 1);
    }

}
