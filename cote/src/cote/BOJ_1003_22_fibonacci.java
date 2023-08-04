package cote;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1003_22_fibonacci {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
		}
	}
	
	private static int fibonacci(int a) {
		if(a == 0) {
			return 0;
		} else if(a == 1) {
			return 1;
		} else {
			return fibonacci(a-1) + fibonacci(a-2);
		}
	}
}
