public class Q3_max {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Fetch maximum Time: " + System.nanoTime());
        return max;
    }
    
}
