package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_practice {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(br.readLine());
		factorial(a);
		System.out.println(factorial_recursive(a));
	}
	
	public static int factorial(int N) { //반복적으로 구현한 팩토리얼 
		int result = 1;
		for(int i=0; i<N; i++) {	
			result *= i+1;
		}
		return result;
	}
	
	public static int factorial_recursive(int N) { //재귀적으로 구현한 팩토리얼 
		if(N <= 1) {
			return 1;
		} else {
			return N * factorial_recursive(N-1);
		}
	}
}

