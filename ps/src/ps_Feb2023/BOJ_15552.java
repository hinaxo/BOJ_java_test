package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15552 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	static int T;		//	# of test-case
	static int A, B;	//	2 integers
	
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(br.readLine());	//	정수가 한 줄에 하나만 들어올 때 
		
		for(int t= 1; t <= T; t++) {
			tokens = new StringTokenizer(br.readLine());	//	정수가 한 줄에 여러 개 들어올 때
		
			A = Integer.parseInt(tokens.nextToken());
			B = Integer.parseInt(tokens.nextToken());
		
			sb.append(A + B).append("\n");	//	매번 출력하지 말고 StringBuilder에 모아서 한 번에 출
		}
		
		System.out.print(sb);
	}
}
