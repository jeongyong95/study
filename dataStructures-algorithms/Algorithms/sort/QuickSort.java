package Algorithms.sort;

// 분할 정복 패러다임
public class QuickSort {
    public void quickSort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = arr[(pl + pr) / 2];

        do {
            // 피벗보다 큰 요소를 찾습니다.
            while (arr[pl] < pivot) {
                pl++;
            }

            // 피벗보다 작은 요소를 찾습니다.
            while (arr[pr] > pivot) {
                pr--;
            }

            // 왼쪽과 오른쪽 포인터가 서로를 넘지 않았다면 찾은 요소끼리 피벗 기준으로 정렬합니다.
            if (pl <= pr) {
                swap(arr, pl++, pr--);
            }

            // 왼쪽과 오른쪽 포인터가 서로를 넘으면 탐색을 종료합니다.
        } while (pl <= pr);

        // 왼쪽 시작점이 오른쪽 포인터보다 작으면 왼쪽 시작점부터 오른쪽 포인터까지 퀵 정렬을 수행합니다.
        if (left < pr) {
            quickSort(arr, left, pr);
        }

        // 오른쪽 시작점이 왼쪽 포인터보다 크면 왼쪽 포인터부터 오른쪽 시작점까지 퀵 정렬을 수행합니다.
        if (right > pl) {
            quickSort(arr, pl, right);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}