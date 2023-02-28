package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1952_27_snail {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(tokens.nextToken());//행
		int N = Integer.parseInt(tokens.nextToken());//열
		int output = 0;
		if(M>N) {
			output = (N-1)*2+1;
		} else {
			output = (M-1)*2;
		} 
		System.out.println(output);
	}
}
