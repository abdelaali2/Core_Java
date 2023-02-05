public class Q3_min {
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Fetch minimum Time: " + System.nanoTime());
        return min;
    }
}
