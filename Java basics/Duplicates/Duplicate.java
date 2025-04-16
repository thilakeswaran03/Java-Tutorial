
public class Duplicate {
    public static void findusingfor(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is: " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 10, 5 };
        findusingfor(arr);
    }
}