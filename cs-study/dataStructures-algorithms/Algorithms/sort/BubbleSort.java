package Algorithms.sort;

/**
 * BubbleSort
 */
public class BubbleSort {
    static void bubbleSort(int[] arr) {

        // 배열 앞쪽부터 정렬해간다.
        for (int i = 0; i < arr.length - 1; i++) {
            // 가장 뒤에 있는 요소들부터 비교해서 작은 값을 앞으로 한 칸씩 당긴다.
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}