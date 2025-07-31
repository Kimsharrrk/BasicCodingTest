package NIMDA;

import java.util.ArrayList;

public class DFS {
    static boolean[] visited; // 필수 ) 방문 여부를 기록할 배열
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 필수 )

    public static void dfs(int node) {
        visited[node] = true; //필수 ) 방문표시
        System.out.print(node + " "); //  원하는 작업 수행

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next); //재귀호출
            }
        }
    }

    public static void main(String[] args) {
        int n = 6; // 노드 수
        visited = new boolean[n + 1];  // 필수 ) 방문 여부를 기록할 배열

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가 (양방향 예시)
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(6);

        // 정점 1에서 시작
        dfs(1); // 필수 ) 시작 노드
    }

}


