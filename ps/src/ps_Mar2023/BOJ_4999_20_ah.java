package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4999_20_ah {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		String N = br.readLine();
		String M = br.readLine();
		if(N.length()>=M.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
