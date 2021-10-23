#   선택 정렬(Selection Sort)

##  소개
- 가장 작은 요소부터 선택하여 순서대로 정렬하는 알고리즘입니다.
- 선택 --> 교환 --> 정렬이 반복됩니다.
- 정렬은 배열의 앞쪽부터 이뤄집니다.
- 선택할 요소를 고르는 구간은 뒤쪽으로 점점 좁아집니다.
- 배열의 요소가 n개 있을 때 시간복잡도는 `O(n^2)`

##  구현
~~~java
public class SelectionSort {
    static void selectionSort(int[] arr) {
        // 앞쪽부터 순서대로 정렬합니다.
        for (int i = 0; i < arr.length; i++) {
            // 가장 작은 값의 인덱스를 찾기 위해 초기화합니다.
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 탐색 과정에서 더 작은 값이 있다면 해당 값의 인덱스를 저장합니다.
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // 하나의 라운드가 끝나고 작은 값을 정렬할 위치에 있는 값과 교환합니다.
            swap(arr, i, min);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
~~~