#   자료구조 : 이진 인덱스 트리(BIT, Binary Indexed Tree)

##  개요
- 펜윅 트리(Fenwick Tree)라고도 한다.
- 누적 합 배열의 동적 자료구조이다.
- 이름은 트리이지만 배열로 표현한다.
- 모든 배열의 인덱스가 1부터 시작한다고 가정한다. 그래야 구현하기가 좀 더 쉽다.
- 시간복잡도가 O(log n)인 2가지 연산을 제공한다.
  - update(int k, int diff) : 배열의 원소 갱신
  - sum(int k) : 1번 원소부터 k번 원소까지의 구간 합 계산
- p(k) : k의 약수 중에서 가장 큰 2의 거듭제곱.
  - p(k) = sum(k - p(k) + 1, k)
  - 위치 k에서 끝나면서 그 길이가 p(k)인 구간의 합
- BIT를 사용하면 어떤 sum(1, k)의 값도 O(log n)에 구할 수 있다.
- 배열의 원소를 갱신하면 BIT에서 해당 원소가 포함되어 있는 값도 갱신해야 한다.

##  구현
- p(k)의 값은 비트 연산을 이용하여 효과적으로 구할 수 있다.
  - p(k) = k & -k
  - k의 비트 1중에서 최하위 비트 1개만 남기는 공식이다.

```java
// 주어진 값
int[] arr = new int[n+1];

// 이진 인덱스 트리, 인덱스는 1부터 시작해야 편하다.
int[] tree = new int[n+1];
---
// sum(1, k)의 값을 구하는 함수
int sum(int k) {
  int result = 0;
  while(k >= 1) {
    result += tree[k];
    k -= k & -k;
  }
  return result;
}

// arr[k]의 값을 diff만큼 증가시키는 함수
// diff는 양수(증가)일 수도 있고, 음수(감소)일 수도 있다.
void update(int k, int diff) {
  while(k <= n) {
    tree[k] += diff;
    k += k & -k;
  }
}
```