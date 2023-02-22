package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2355_17_sigma {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		long A = Long.parseLong(tokens.nextToken());
		long B = Long.parseLong(tokens.nextToken());
		long start = Math.min(A, B);
		long end = Math.max(A, B);
//		System.out.println(start + "start");
//		System.out.println(end + "end");
		long sum = (end * (end+1) / 2) - ((start-1) * start / 2);
		System.out.println(sum);
	}
}
