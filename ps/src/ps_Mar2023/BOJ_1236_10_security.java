package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_1236_10_security {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken()); //세로, 행의 개수 
		int M = Integer.parseInt(tokens.nextToken()); //가로, 열의 개수 
		int[] securityRow = new int[N];
		int[] securityColumn = new int[M];
		
		for(int i=0; i<N; i++) {// 행 길이만큼 
			String row = br.readLine(); //--*--
			int rowCount = i+1;
			for(int j=0; j<M; j++) {//열 길이만큼 
				int columnCount = j+1;
				if(row.substring(j, j+1).equals("X")) {
					if(!Arrays.stream(securityRow).anyMatch(x -> x == rowCount)) {
						securityRow[i] = rowCount;
					}
					if(!Arrays.stream(securityColumn).anyMatch(x -> x == columnCount)) {
						securityColumn[j] = columnCount;
					}
				}
			}
		}
		List<Integer> srList = Arrays.stream(securityRow).boxed().collect(Collectors.toList()); //정수형 배열을 리스트로 만들기 
		List<Integer> scList = Arrays.stream(securityColumn).boxed().collect(Collectors.toList());

		srList.removeAll(Arrays.asList(0, null));
		scList.removeAll(Arrays.asList(0, null));
		if(N-srList.size() >= M-scList.size()) {
			System.out.println(N-srList.size());
		} else {
			System.out.println(M-scList.size());
		}
		
	}
}
