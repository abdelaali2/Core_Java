public class Q4_BinarySearch {
    public static int BinarySearch(int[] arr, int item) {
        int midIndex = (arr.length - 1) / 2;
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        while (minIndex <= maxIndex) {
            if (item == arr[midIndex]) {
                return midIndex;
            } else if (item > arr[midIndex]) {
                minIndex = midIndex + 1;
                midIndex = (maxIndex + minIndex) / 2;
            } else if (item < arr[midIndex]) {
                maxIndex = midIndex - 1;
                midIndex = (maxIndex + minIndex) / 2;
            }
        }
        return -1;
    }
}
