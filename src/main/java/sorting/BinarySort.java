package sorting;

public class BinarySort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3, 6, 9, 7, 10, 8};
        binarySort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    private static void binarySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            int index = binarySearch(arr, key, 0, j);
            while (j >= index) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, key, start, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, end);
        }
    }

}
