package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1357_27_reverseSum {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(tokens.nextToken());
		int Y = Integer.parseInt(tokens.nextToken());
		System.out.println(flip(flip(X)+flip(Y)));
	}
	
	public static int flip(int num) {
		int output = 0;
		while(num != 0) {
			output = output*10 + num%10;
			num /= 10;
		}
		return output;
	}
	
}
