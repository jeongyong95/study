#	최소 신장 트리 : 크루스칼(Kruskal) 알고리즘

##  개요
- 그리디 기반의 최소 신장 트리(MST, Minimum Spanning Tree)를 구하는 알고리즘
- 간선을 다 떼어내고 가중치 순으로 간선들을 조회하며, 사이클이 생기지 않으면 간선을 노드에 연결한다.
- 알고리즘 실행을 마친 후에는 모든 노드가 연결된 MST가 완성된다.
- 가중치를 오름차순으로 정렬하여 연결하면 최소 신장 트리, 가중치를 내림차순으로 정렬하여 연결하면 최대 신장 트리를 구할 수 있다.
- MST를 만들기 위해서는 반드시 최소 가중치 간선이 포함되어야 하므로, 크루스칼 알고리즘의 결과는 항상 MST이다.

##  구현
- 그래프를 간선 리스트 형태로 구현하는 게 편리하다.
- 간선이 사이클이 형성되는지 파악하고, 간선을 연결하기 위해서 [유니온-파인드 자료구조](https://joojeongyong.tistory.com/100)를 사용한다.
- 노드가 n개, 간선이 m개일 때, 간선 리스트 정렬을 제외한 시간복잡도는 O(m Log n)이다.

~~~java
Edge[] edgeList;

// 크루스칼 알고리즘
// isSame과 unite는 유니온-파인드 자료구조 참고
Arrays.sort(edgeList);
for (Edge edge : edgeList) {
    if (!isSame(a, b)) {
        unite(a, b);
    }
}

// 간선 구현체
class Edge implement Comparable<Edge> {
    int u;
    int v;
    int w;

    public Edge() {

    }

    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @override
    public int compareTo(Edge o) {
        return this.w - o.w;
    }
}
~~~