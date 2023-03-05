package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2441_1_asterisk4 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {	
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<N-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
