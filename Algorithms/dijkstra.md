#	최단 경로 알고리즘 : 다익스트라(Dijkstra)

##	개요

- 특정 노드에서 다른 모든 노드 간 최단 경로를 계산하는 알고리즘이다.
- 벨만-포드 알고리즘보다 효율적이다.
- 가중치에 음수가 없는 그래프에서만 사용할 수 있다.
- 벨만 포드처럼 각 노드까지의 거리를 INF로 초기화하고 탐색과정에서 값을 줄인다.
- 알고리즘의 각 단계에서는 아직 처리하지 않은 노드 중 거리가 가장 작은 노드를 먼저 선택하고, 해당 노드에서 시작하는 모든 간선을 보며 다른 노드까지의 거리를 줄일 수 있다면 줄인다.
- 음수 가중치가 없다고 전제하여 모든 간선을 단 한 번만 처리한다. 그래서 매우 효율적이다.
- 각 노드를 처리한 뒤에는 해당 노드까지의 거리가 절대 변하지 않는다.
- 음수 간선이 존재하면 사용할 수 없다.



# 구현

- 효율적인 구현을 위해서는 아직 처리하지 않은 노드 중 거리가 가장 짧은 노드를 효율적으로 찾아야 한다.
- 노드 선택을 log 시간에 구할 수 있는 우선순위 큐를 이용하여 처리 순서를 관리한다.
- 거리가 바뀔 때마다 해당 노드를 우선순위 큐에 추가한다.
- 그래프는 인접리스트의 형태로 저장된다.
- 알고리즘은 모든 노드를 탐색하며 진행되고, 각 노드에 연결된 간선에 대해서 값을 한 번씩만 우선순위 큐에 추가한다.
- 노드의 개수 n, 간선의 개수 m이면 시간복잡도는 O(n+m)이다.



### Java

<code>

int INF = 무한, 알고리즘 구현 상 도출될 수 없는 큰 값으로 선언함.

int[] dist;

boolean[] visited;

PriorityQueue<Node> pq;

class Node implements Comparable<Node> {

​	int node;

​	int cost;

​	

​	public Node() {

​	}

​	

​	public Node(int node, int cost) {

​		this.node = node;

​		this.cost = cost;

​	}

​	

​	@override

​	public int compareTo(Node o) {

​		return this.cost - o.cost;

​	}

}

...

int dijkstra(int start, int target) {

​	for(int i = 1; i <= n; i++) {

​		dist[i] = INF;

​	}



​	dist[x] = 0;

​	pq.offer(new Node(x, dist[x]));

​	while(!pq.isEmpty()) {

​		Node current = pq.poll();

​		int u = current.node;



​		if(u == target) {

​			return dist[u];

​		}



​		if(dist[u] < current.cost) {

​			continue;

​		}



​		if(!visited[u]) {

​			visited[u] = true;

​			foreach(Node next : adjList[u]) {

​				int v = next.node;

​				int w = next.cost;

​				if(dist[v] > dist[u] + w) {

​					dist[v] = dist[u] + w;

​					pq.offer(new node(v, dist[v]));

​				}

​			}

​		}

​	}

​	return -1;

}

</code>