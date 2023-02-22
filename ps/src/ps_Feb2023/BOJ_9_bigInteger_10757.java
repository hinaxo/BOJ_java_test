package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class BOJ_9_bigInteger_10757 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(tokens.nextToken());
		BigInteger B = new BigInteger(tokens.nextToken());
		A = A.add(B);
		System.out.println(A);
	}
}


