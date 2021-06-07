#	최단 경로 알고리즘 : 벨만-포드(Bellman-Ford)

## 개요

- 시작 노드에서부터 다른 모든 노드로 가는 최단 경로를 계산하는 알고리즘이다.
- 길이가 '음수인 사이클'을 포함하지 않는 모든 그래프에서 최단 경로를 구할 수 있다.
- 음수인 사이클이 그래프에 존재하는지 파악할 수 있다.



## 구현

- 각 노드의 초깃값을 설정한다. 시작 노드는 0, 다른 모든 노드는 INF(무한대)이다.
- n-1번의 라운드를 돌며 매 라운드마다 모든 노드에 걸쳐 경로를 최소화한다.
- 라운드를 n회 돌아서 n회째에서도 경로 단축이 이뤄지면 음수 사이클이 존재한다고 판단한다.
- n-1회의 라운드 동안 매회 m개의 간선을 처리하기 때문에 시간복잡도는 O(nm)이다.



###	Java

<code>

int INF = 무한, 알고리즘 구현 상 도출될 수 없는 큰 값으로 선언함.

int[] dist;

...

int bellmanFord(int begin, int target) {

​	for(int i = 1; i <= n; i++) {

​		dist[i] = INF;

​	}



​	dist[begin] = 0;

​	for(int i = 1; i <= n-1; i++) {

​		foreach(Edge edge : edges) {

​			int u = edge.start;

​			int v = edge.end;

​			int w = edge.cost;

​		

​			if(dist[v] > dist[u] + w) {

​				dist[v] = dist[u] + w;

​			}

​		}

​	}

​	return dist[target];

}

</code>