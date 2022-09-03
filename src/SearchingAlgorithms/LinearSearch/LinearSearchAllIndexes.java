package SearchingAlgorithms.LinearSearch;

import java.util.ArrayList;

public class LinearSearchAllIndexes {
    public static void main(String[] args) {
        int[] a = {38, 10, 20, 38,25, 38, 197, 156, 95, 38};
        int target = 38;
        int index = 0;
        findIndexes1(a, target, index);

        System.out.println(l1);

        ArrayList<Integer> l2 = new ArrayList<>(3);
        ArrayList<Integer> ans = findIndexes2(a, target, index, l2);
        System.out.println(ans);
//        System.out.println(l2);

        ArrayList<Integer> l3 =  findIndexes3(a, target, index);
        System.out.println(l3);


    }

    // 2]
    static ArrayList<Integer> findIndexes2(int[] a, int target, int index, ArrayList<Integer> l2) {
        if (a[index] == target) {
            l2.add(index);
        }

        if (index == a.length - 1) {
            return l2;
        }
        return findIndexes2(a, target, index + 1, l2);
    }


    // 1]
    static ArrayList<Integer> l1 = new ArrayList<>(3);
    static void findIndexes1(int[] a, int target, int index) {

        if (a[index] == target) {
            l1.add(index);
        }

        if (index == a.length - 1) {
            return;
        }
        findIndexes1(a, target, index + 1);
    }

    // 3]
    static ArrayList<Integer> findIndexes3(int[] a, int target, int index) {
        ArrayList<Integer> l3= new ArrayList<>(3);
        if (a[index] == target) {
            l3.add(index);
        }

        if (index == a.length - 1) {
            return l3;
        }
        ArrayList<Integer> allReturnList = findIndexes3(a, target, index + 1);
        l3.addAll(allReturnList);
        return l3;
    }

}

