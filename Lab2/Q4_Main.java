public class Q4_Main {
    public static void main(String[] args) {
        Q4_BinarySearch obj = new Q4_BinarySearch();
        int[] array = { 1, 10, 25, 123, 264, 123, 2132, 875, 33, 21, 33, 54, 2, 9 };
        int item = 2132;
        int returnValue = obj.BinarySearch(array, item);
        if (returnValue != -1) {
            System.out.println("Item " + item + " is found at index = " + returnValue);
        } else {
            System.out.println("Item is not found");
        }
        System.out.println("Total Time: " + System.nanoTime());
    }
}
