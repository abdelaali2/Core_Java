public class Q3_Main {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i+1;
        }
        Q3_min minObject = new Q3_min();
        Q3_max maxObject = new Q3_max();
        int minValue = minObject.getMin(array);
        int maxValue = maxObject.getMax(array);
        System.out.println(minValue + ", " + maxValue);
        System.out.println("Total Time: " + System.nanoTime());
    }
}
