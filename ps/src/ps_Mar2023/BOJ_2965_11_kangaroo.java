package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2965_11_kangaroo {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		int C = Integer.parseInt(tokens.nextToken());
		if(B-A >= C-B) { 
			System.out.println(B-A-1);
		} else { // 
			System.out.println(C-B-1);
		}
		
	}
}
//4 5 6
