package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3,6,9,7,10,8};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
    private static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    swap(arr, j, j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
