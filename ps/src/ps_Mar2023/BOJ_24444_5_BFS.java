package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ_24444_5_BFS {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	static int N, M, R;
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static int time = 1;
	
	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(tokens.nextToken()); //정점의 수 
		M = Integer.parseInt(tokens.nextToken()); //간선의 수 
		R = Integer.parseInt(tokens.nextToken()); //시작 정점 
	
		visited = new int[N + 1];
		
		for(int i = 0; i <= N; i++)
			graph.add(new ArrayList<Integer>());
		
		for(int i = 0; i < M; i++) {
			int a, b;
			tokens = new StringTokenizer(bf.readLine());
			
			a = Integer.parseInt(tokens.nextToken()); //간선 정보 
			b = Integer.parseInt(tokens.nextToken()); //간선 정보 
			
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for(int i = 1; i <= N; i++)
			Collections.sort(graph.get(i));
	
		bfs();
		
		for(int i = 1; i <= N; i++)
			sb.append(visited[i]).append("\n");
		
		System.out.println(sb);
	}
	
	static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[R] = time++;
		q.offer(R);
		
		while(!q.isEmpty()) {
			int cnum = q.poll();
			
			for(int i = 0; i < graph.get(cnum).size(); i++) {
				int next = graph.get(cnum).get(i);
				
				if(visited[next] == 0) {
					visited[next] = time++;
					q.offer(next);
				}
			}
		}
	}
}