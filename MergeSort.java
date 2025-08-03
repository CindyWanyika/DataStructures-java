public class MergeSort {

    // Main merge sort method
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; // Base case

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements to left and right subarrays
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Helper method to merge two sorted arrays into original array  bmhmbcx xhpl';

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right (if any)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Optional: Main method to test it
    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        for (int n : data) System.out.print(n + " ");

        mergeSort(data);

        System.out.println("\nSorted Array:");
        for (int n : data) System.out.print(n + " ");
    }
}
