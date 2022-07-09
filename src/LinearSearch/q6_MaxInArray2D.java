package LinearSearch;

public class q6_MaxInArray2D {
        public static void main(String[] args) {

            int[][] a ={
                    {1,25,38,4,52},
                    {51,26,49},
                    {10,65,36,56,68},
                    {6,9}
            } ;

            System.out.println(max(a));
            System.out.println(min(a));
        }

        static int max(int[][] a) {
            int max = a[0][0];
            for (int[] ints : a) {
                for (int element : ints)
                    if (element > max) {
                        max = element;
                    }
            }
            return max;
        }

        static int min(int[][] a) {
            int min = a[0][0];
            for (int[] ints : a) {
                for (int element : ints)
                    if (element < min) {
                        min = element;
                    }
            }
            return min;
        }
}
