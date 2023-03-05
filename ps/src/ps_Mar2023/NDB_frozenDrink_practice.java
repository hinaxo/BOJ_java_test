package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_frozenDrink_practice {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		if(x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x-1, y);
			dfs(x, y-1);
			dfs(x+1, y);
			dfs(x, y+1);
			return true; // 위의 dfs값과 상관없이 true가 리턴됨 
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = str.charAt(j) - '0'; //문자끼리 계산 (아스키코드값 계산)
			}
		}
		
		int result = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i, j)) {
					result += 1; //아이스크림 개수 
				}
			}
		}
		System.out.println(result);
	}
}
