package searching;

public class BinarySearch {

    public static void main(String[] args) {
    //    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 7;
        int index = binarySearch(arr, key);
        System.out.println("Index of " + key + " is " + index);

    }
    private static int binarySearch(int[] arr,int key){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
