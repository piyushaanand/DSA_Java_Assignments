public class HA3Q4 {
    public static void rearrangeArray(int[] A, int k) {
        rearrangeArrayHelper(A, k, 0, A.length - 1);
    }

    private static void rearrangeArrayHelper(int[] A, int k, int left, int right) {
        if (left >= right) {
            return; // Base case: Array has been traversed
        }

        if (A[left] > k && A[right] <= k) {
            // Swap elements if left element is greater than k and right element is less than or equal to k
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
        }

        if (A[left] <= k) {
            rearrangeArrayHelper(A, k, left + 1, right); // Recursively process the next element from the left
        }

        if (A[right] > k) {
            rearrangeArrayHelper(A, k, left, right - 1); // Recursively process the next element from the right
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 6, 3, 8, 4};
        int k = 5;

        System.out.println("Original array:");
        printArray(array);

        rearrangeArray(array, k);

        System.out.println("Rearranged array with elements <= " + k + " before elements > " + k + ":");
        printArray(array);
    }

    private static void printArray(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
