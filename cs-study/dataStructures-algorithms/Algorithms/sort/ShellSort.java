package Algorithms.sort;

/**
 * ShellSort
 */
public class ShellSort {

    public void shellSort(int[] arr) {

        // 증분값 h
        int h;

        // h의 초기값을 구합니다.
        for (h = 1; h < arr.length / 9; h = h * 3 + 1) {

        }

        // 정렬을 수행합니다.
        for (; h > 0; h /= 3) {
            for (int i = h; i < arr.length; i++) {
                int j;
                int temp = arr[i];
                for (j = i - h; j > 0 && arr[j] > temp; j -= h) {
                    arr[j + h] = arr[j];
                }
                arr[j + h] = temp;
            }
        }
    }
}