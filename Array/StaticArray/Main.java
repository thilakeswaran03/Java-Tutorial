public class Main {

    public static int size = 0;

    public static void add(int[] arr, int value) {
        if (size == arr.length) {
            System.out.println("Index out of bound");
            return;
        }

        int left = 0;
        int right = size - 1;
        int insertPos = size;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                insertPos = mid;
                right = mid - 1;
            }
        }

        for (int i = size - 1; i >= insertPos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[insertPos] = value;
        size++;
    }

    public static void remove(int[] arr) {
        if (size <= 0) {
            System.out.println("Index out of bounds");
        } else {
            size--;
            arr[size] = 0;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rightshift(int[] arr) {
        if (size > 0 && size < arr.length) {
            for (int i = size; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = 0;
            size++;
        } else {
            System.out.println("Cannot right shift");
        }
    }

    public static void leftshift(int[] arr) {
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0;
            size--;
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void rightrotate(int[] arr) {
        if (size > 0) {
            int temp = arr[size - 1];
            for (int i = size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void leftrotate(int[] arr) {
        if (size > 0) {
            int temp = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = temp;
        } else {
            System.out.println("Array is empty");
        }
    }

    public static int getsize(int[] arr) {
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        add(arr, 10);
        add(arr, 20);
        display(arr); // 10 20

        remove(arr);
        display(arr); // 10

        add(arr, 20);
        add(arr, 30);
        add(arr, 40);
        add(arr, 50);
        System.out.println("Size of used elements: " + size);

        add(arr, 60); // Index out of bound
        display(arr); // 10 10 30 40 50

        rightshift(arr);
        display(arr); // 0 10 10 30 40

        leftshift(arr);
        leftshift(arr);
        display(arr); // 10 30 40

        rightrotate(arr);
        display(arr); // 40 10 30
    }
}
