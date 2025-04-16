public class array {
    public static boolean  check(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        if (check(arr)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");

        }
    }
}