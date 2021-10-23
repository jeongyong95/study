package Algorithms.sort;

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