#   버블 정렬(Bubble Sort)

##  소개
- 이웃한 두 수의 크기를 비교하여 교환을 반복합니다.
- 매 라운드마다 1개씩 요소가 앞쪽부터 정렬됩니다.
- 정렬은 앞쪽부터 이뤄지고, 라운드 별 수의 크기 비교는 뒤쪽부터 시작됩니다.
- 배열의 요소가 n개 있을 때 시간복잡도는 `O(n^2)`

##  구현
~~~java
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
~~~