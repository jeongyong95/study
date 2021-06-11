#   자료구조 : 유니온-파인드(Union-Find)

##  개요
- 집합의 묶음을 관리하는 자료구조이다.
- 집합은 서로소 집합(Disjoint Set)이고, 하나의 원소는 오직 하나의 집합에 속한다.
- 집합마다 하나의 원소가 해당 집합의 대푯값이 되고, 나머지 원소에서 대표 원소로 가는 경로가 존재한다.
- 유니온-파인드 자료구조는 O(Log n)의 시간복잡도를 가진 2가지 메서드를 제공한다.
  - unite(a, b) : a와 b가 속한 각각의 집합을 하나로 합친다.
  - find(x) : x원소가 속한 집합의 대푯값을 반환한다.
- 집합을 합칠 때, 원소가 더 적은 집합의 대푯값을 원소가 더 많은 집합의 대푯값으로 연결함으로써 효율적인 unite 연산을 수행할 수 있다.

##  구현
- 유니온-파인드는 배열을 사용해서 쉽게 구현할 수 있다.
- 배열은 각 원소에 대해서 경로상의 다음 원소를 저장하는 배열이다.
- 대표 원소는 자기 자신이 배열에 저장된다.
  
~~~java
int[] link; // 경로상의 다음 원소를 저장하는 배열 == 원소의 집합을 식별하는 배열
int[] size; // 해당 원소가 속해있는 집합의 크기를 저장하는 배열

// 초기화하는 반복문. 각 원소는 개별적인 집합에서 출발한다.
for (int i = 1; i <= n; i++) {
    link[i] = i;
    size[i] = 1;
}

// find : 원소 x의 대푯값을 반환 == 원소 x가 속한 집합의 대푯값을 반환한다.
int find(int x) {
    while (x != link[x]) {
        x = link[x];
    }
    return x;
}

// find 연산은 경로압축 형태로 구현할 수 있다.
// 경로 상의 모든 원소가 대푯값을 가리킨다.
// 동적 연결성 확인 알고리즘 같은 몇몇 경우에는 사용할 수 없다.
int find(int x) {
    if (x == link[x]) {
        return x;
    }
    return link[x] = find(link[x]);
}

// isSame : 두 원소가 같은 집합에 속해있는지 판단한다.
boolean isSame(int a, int b) {
    return find(a) == find(b);
}

// unite : 두 원소가 속해있는 집합을 하나로 합친다.
void unite(int a, int b) {
    a = find(a);
    b = find(b);

    if (size[a] > size[b]) {
        size[a] += size[b];
        link[b] = a;
    } else if (size[a] < size[b]) {
        size[b] += size[a];
        link[a] = b;
    }
}
~~~