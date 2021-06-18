#   쉘 정렬(Shell Sort)

##  소개
- 도널드 쉘(Donald L. Shell)이 고안한 정렬 알고리즘입니다.
- 삽입 정렬의 장점은 살리고, 단점은 보완한 정렬 알고리즘입니다.
- 단순 삽입 정렬
  - 장점 : 정렬을 마친 상태에 가까울수록 정렬속도가 높아짐
  - 단점 : 삽입할 위치가 멀수록 이동횟수가 증가함
- 정렬할 배열의 요소를 그룹으로 나누어 그룹별 삽입정렬(H-정렬)을 수행합니다.
- 그룹을 합치며 정렬을 반복합니다.
- 증분값 H는 초깃값이 너무 크면 효과가 없습니다.
  - n(배열의 요솟수)/9 값을 넘지 않도록 합니다.

##  구현

~~~java
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
~~~