import java.util.Arrays;
public class arrayoperations {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int n = 6;
        arr[0] = 40;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 50;
        arr[5] =  60;
        System.out.println("Initial array:");
        printArray(arr, n);
        System.out.println("\nElement at index 2: " + arr[2]);
        n = insertAtIndex(arr, n, 25, 3);
        System.out.println("\nAfter inserting 25 at index 3:");
        printArray(arr, n);
        n = deleteAtIndex(arr, n, 4);
        System.out.println("\nAfter deleting index 4:");
        printArray(arr, n);
        n = insertAtEnd(arr, n, 70);
        System.out.println("\nAfter inserting 70 at end:");
        printArray(arr, n);
        n = deleteByValue(arr, n, 25);
        System.out.println("\nAfter deleting value 25:");
        printArray(arr, n);
        int target = 30;
        int index = linearSearch(arr, n, target);
        System.out.println("\nLinear Search: " + target + " found at index: " + index);
        bubbleSort(arr, n);
        System.out.println("\nAfter Bubble Sort:");
        printArray(arr, n);
        target = 50;
        index = binarySearch(arr, 0, n - 1, target);
        System.out.println("\nBinary Search: " + target + " found at index: " +index);
        selectionSort(arr, n);
        System.out.println("\nAfter Selection Sort:");
        printArray(arr, n);
        Arrays.sort(arr, 0, n);
        System.out.println("\nAfter Arrays.sort():");
        printArray(arr, n);
    }
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static int insertAtIndex(int[] arr, int n, int element, int index) {
        if (n >= arr.length || index < 0 || index > n) return n;
        for (int i = n; i > index; i--) arr[i] = arr[i - 1];
        arr[index] = element;
        return n + 1;
    }
    public static int insertAtEnd(int[] arr, int n, int element) {
        if (n >= arr.length) return n;
        arr[n] = element;
        return n + 1;
    }
    public static int deleteAtIndex(int[] arr, int n, int index) {
        if (index < 0 || index >= n) return n;
        for (int i = index; i < n - 1; i++) arr[i] = arr[i + 1];
        return n - 1;
    }
    public static int deleteByValue(int[] arr, int n, int value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) return deleteAtIndex(arr, n, i);
        }
        return n;
    }
    public static int linearSearch(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) return binarySearch(arr, left, mid - 1, target);
            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
