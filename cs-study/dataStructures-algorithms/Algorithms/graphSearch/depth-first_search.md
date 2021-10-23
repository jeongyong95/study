#	그래프 탐색 알고리즘 : 깊이 우선 탐색(Depth-First Search)

##	개요

- 그래프의 간선을  따라가며 도달 가능한 모든 노드를 처리하는 알고리즘이다.
- 새로운 노드가 발견되는 동안 단일한 경로를 따른다.
- 알고리즘을 진행하며 방문한 노드를 기록하기 때문에 각 노드는 한 번씩만 방문된다.



##	구현

- 재귀(Recursive)를 이용하여 쉽게 구현할 수 있다.
- 그래프를 인접리스트로 표현하면 편하다.
- 노드가 n개, 간선이 m개 존재하는 DFS의 시간복잡도는 O(n+m)이다.



###	Java

<code>

List<Integer>[] adjList;

boolean[] visited;

...

void dfs(int n) {

​	if(visited[n]) {

​		return;

​	}

​	visited[n] = true;

​	// 이 부분에서 현재 방문한 노드에서 할 작업을 수행

​	foreach(Integer i : adjList[n]) {

​		dfs(i);

​	}

}

</code>