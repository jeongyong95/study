#   삽입 정렬(Insertion Sort)

##  소개
- 선택한 요소를 선택한 위치의 앞쪽에 있을 수 있는 올바른 위치에 삽입합니다.
- 2번 째 요소부터 선택해서 정렬 작업을 수행합니다.
- 선택한 요소 앞쪽은 항상 정렬되어 있는 구간입니다.
- 정렬이 수행되면서 정렬된 구간을 탐색하는 내부 반복문의 반복 횟수는 증가합니다.
- 배열의 요소가 n개 있을 때 시간복잡도는 `O(n^2)`

##  구현
~~~java
public class InsertionSort {
    static void insertionSort(int[] arr) {
        // 정렬은 배열의 2번째 요소부터 시작합니다.
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            // 정렬된 구간을 뒤에서부터 앞으로 순회한다.
            // 처음 temp와 arr[j]는 같은 대상이다.
            // arr[j - 1]이 temp보다 크면 temp는 그 앞에 삽입되어야 하므로 arr[j - 1]을 뒤로 한 칸 밀어낸다.
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            // temp가 놓일 j가 결정되었다.
            // temp를 배열의 j번째에 삽입한다.
            arr[j] = temp;
        }
    }
}
~~~