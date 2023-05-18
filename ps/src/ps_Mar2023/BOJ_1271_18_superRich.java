package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1271_18_superRich {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());

		BigInteger money = new BigInteger(tokens.nextToken());
		BigInteger people = new BigInteger(tokens.nextToken());
		System.out.println(money.divide(people));
		System.out.println(money.remainder(people));
	}
}
