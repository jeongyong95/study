# 그래프 탐색 알고리즘 : 너비 우선 탐색(Breadth-First Search)

##	개요

- 시작 노드에서부터 거리가 증가하는 순서대로 다른 노드를 방문하는 알고리즘이다.
- 노드 방문이 그래프의 여러 부분에 걸쳐서 진행되기 때문에 DFS보다 구현하기가 어렵다.



##	구현

- 방문 예정인 노드들을 관리할 큐를 사용해서 구현한다.
- 인접리스트를 사용하면 구현하기 쉽다.
- 노드가 n개, 간선이 m개 존재하는 BFS의 시간복잡도는 O(n+m)이다.



###	Java

<code>

Queue<Integer> q;

boolean[] visited;

int[] dist;

void bfs() {

​	dist[x] = 0;

​	q.offer(x);

​	visited[x] = true;



​	while(!q.isEmpty()) {

​		int current = q.poll();

​		// 현재 위치에서 처리할 작업을 구현한다.

​		foreach(Integer i : adjList[current]) {

​			if(visited[i]) {

​				continue;

​			}

​			visited[i] = true;

​			dist[i] = dist[current] + 1;

​			q.offer(i);

​		}

​	}

}



</code>